package com.github.gang;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.github.gang.life.MyLife;

public class MyLifeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        MyLife life = new MyLife();
        getLifecycle().addObserver(life);
    }
}
