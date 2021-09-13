package com.example.batterylow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    //BatteryLow batteryLow = new BatteryLow();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onBroadcastSendBtnClicked(View view){
        Intent intent = new Intent();
        intent.setAction("Com.Sample.myBroadcastMessage");
        intent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        sendBroadcast(intent);
    }


/**
    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter filter = new IntentFilter(Intent.ACTION_BATTERY_LOW);
        registerReceiver(batteryLow, filter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(batteryLow);

**/
    }
//}