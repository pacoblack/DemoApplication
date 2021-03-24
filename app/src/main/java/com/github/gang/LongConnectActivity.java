package com.github.gang;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.github.mina.ConnectUtils;
import com.github.mina.client.ClientConnectManager;
import com.github.mina.client.HeartBeatHandler;
import com.github.mina.client.HeartBeatListener;
import com.github.mina.client.HeartBeatMessageFactory;
import com.github.mina.service.FrameCodecFactory;
import com.github.mina.service.LongConnectService;
import com.github.mina.service.SessionManager;

import org.apache.mina.core.filterchain.DefaultIoFilterChainBuilder;
import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.keepalive.KeepAliveFilter;
import org.apache.mina.transport.socket.nio.NioSocketConnector;

import java.net.InetSocketAddress;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class LongConnectActivity extends AppCompatActivity implements LongConnectService.IStartConnectService {

    private final String TAG = "LongConnectActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ClientConnectManager.getInstance().init(this);
        LongConnectService.setIStartConnectService(this);
        Intent intent = new Intent(this, LongConnectService.class);
        startService(intent);
    }


    private void connect2(final Context context) {
        ObservableOnSubscribe<Object> subscribe = new ObservableOnSubscribe<Object>() {
            @Override
            public void subscribe(@NonNull ObservableEmitter<Object> e) throws Exception {
                NioSocketConnector mSocketConnector = new NioSocketConnector();
                //设置协议封装解析处理
                mSocketConnector.getFilterChain().addLast("protocol", new ProtocolCodecFilter(new FrameCodecFactory()));
                //设置心跳包
                KeepAliveFilter heartFilter = new KeepAliveFilter(new HeartBeatMessageFactory());
                //每 5 分钟发送一个心跳包
                heartFilter.setRequestInterval(5 * 60);
                //心跳包超时时间 10s
                heartFilter.setRequestTimeout(10);
                // 获取过滤器链
                DefaultIoFilterChainBuilder filterChain = mSocketConnector.getFilterChain();
                filterChain.addLast("encoder", new ProtocolCodecFilter(new FrameCodecFactory()));
                // 添加编码过滤器 处理乱码、编码问题
                filterChain.addLast("decoder", new ProtocolCodecFilter(new FrameCodecFactory()));
                mSocketConnector.getFilterChain().addLast("heartbeat", heartFilter);
                //设置 handler 处理业务逻辑
                mSocketConnector.setHandler(new HeartBeatHandler(context));
                mSocketConnector.addListener(new HeartBeatListener(mSocketConnector));
                //配置服务器地址
                InetSocketAddress mSocketAddress = new InetSocketAddress(ConnectUtils.HOST, ConnectUtils.PORT);
                //发起连接
                ConnectFuture mFuture = mSocketConnector.connect(mSocketAddress);
                mFuture.awaitUninterruptibly();
                IoSession mSession = mFuture.getSession();
                Log.d(TAG, "connect2======连接成功" + mSession.toString());
                e.onNext(mSession);
                e.onComplete();
            }
        };
        Observable.create(subscribe).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<Object>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull Object o) {
                IoSession mSession = (IoSession) o;
                Log.d(TAG, "connect2======连接成功了吗====" + mSession.isConnected());
                SessionManager.getInstance().setSeesion(mSession);
                SessionManager.getInstance().writeToServer("你看见了吗");
            }

            @Override
            public void onError(@NonNull Throwable e) {
                Log.e(TAG, "Throwable e" + e);
            }

            @Override
            public void onComplete() {

            }
        });

    }


    @Override
    public void startConnect() {
        ClientConnectManager.getInstance().connect(this);
    }
}
