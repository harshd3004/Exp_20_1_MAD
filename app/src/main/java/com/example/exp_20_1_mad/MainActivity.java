package com.example.exp_20_1_mad;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button btnOn,btnOff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOn = (Button) findViewById(R.id.onBtn);
        btnOff = (Button) findViewById(R.id.offBtn);

        btnOn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startService(new Intent(MainActivity.this,WifiService.class));
            }
        });

        btnOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(new Intent(MainActivity.this,WifiService.class));
            }
        });

    }
}