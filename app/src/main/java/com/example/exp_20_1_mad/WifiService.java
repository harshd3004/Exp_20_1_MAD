package com.example.exp_20_1_mad;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;


public class WifiService extends Service {
    WifiManager wifi;
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate(){
        super.onCreate();
        wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        
    }

    @Override
    public int onStartCommand(Intent intent,int flags,int startId){
        wifi.setWifiEnabled(true);
        Toast.makeText(getApplicationContext(), "Started " +wifi.isWifiEnabled(), Toast.LENGTH_SHORT).show();
        return START_STICKY;
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        wifi.setWifiEnabled(false);
        Toast.makeText(getApplicationContext(), "Stopped "+wifi.isWifiEnabled(), Toast.LENGTH_SHORT).show();
    }
}
