package com.github.gang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.github.gang.aidl.IMyAidlInterface;

public class MainActivity extends AppCompatActivity {


    private ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            try {
                long start = System.currentTimeMillis();
                System.out.println("wtg start :" + start);
                Log.d("wtg", "sum is " + IMyAidlInterface.Stub.asInterface(service).add(1, 2) + "， " + Thread.currentThread().getName());
                System.out.println("wtg cost: " + (System.currentTimeMillis() - start));
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final DragView iv_drag= (DragView) findViewById(R.id.iv_drag);
        final View iv_bottom= (View) findViewById(R.id.iv_bottom);
        final TextView visible_tex= (TextView) findViewById(R.id.visible_tex);
        final TextView ori_tex= (TextView) findViewById(R.id.ori_tex);

        final int[] i = {0};
        iv_drag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!iv_drag.isDrag()){
                    i[0]++;
                    Toast.makeText(MainActivity.this, "响应点击" + i[0], Toast.LENGTH_SHORT).show();
                }
                Rect rect = new Rect();
                boolean isVisible = iv_bottom.getGlobalVisibleRect(rect);
                String str = "(" + rect.height() + ", " + rect.width() + ")" + ViewUtils.isViewCovered(iv_bottom);
                System.out.println(str);
                visible_tex.setText(str);
                ori_tex.setText("(" + iv_bottom.getHeight() + ", " + iv_bottom.getWidth() +")");
            }
        });
        iv_drag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MyLifeActivity.class));
//                Intent intent = new Intent();
//                intent.setAction("com.github.gang.myservice");
//                intent.setPackage("com.github.gang");
//                bindService(intent, serviceConnection, BIND_AUTO_CREATE);

            }
        });
    }
}