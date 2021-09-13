package com.example.batterylow;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class BatteryLow extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Log.i("BroadcastReceiver","Broadcast message is received");
        Toast.makeText(context, "Broadcast message is received", Toast.LENGTH_SHORT).show();

    }
}
