package com.example.ajslocationfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.locationfinder.Calculate;

public class MainActivity extends AppCompatActivity {
    Calculate cal;
    TextView txtv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        float distance = cal.getDistanceInKM(18.9398, 19.1136, 72.8354, 72.8697);
         System.out.println("Distance:"+distance);

        // globally
        txtv = (TextView)findViewById(R.id.txt1);
        //in your OnCreate() method
        txtv.setText(String.valueOf(distance));
    }
}