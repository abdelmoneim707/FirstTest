package com.example.abdelmoneim.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
   private TextView factTextView;
   private Button factButton;
   res ana = new res();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        factTextView = (TextView) findViewById(R.id.factTextView);
        factButton = (Button) findViewById(R.id.factButton);
        View.OnClickListener on = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                factTextView.setText(ana.ger());
                Log.i("dddd", "My first log");
                Toast.makeText(MainActivity.this,"تم اظهار معلومة جديده",Toast.LENGTH_SHORT).show();
            }
        };
       factButton.setOnClickListener(on);

    }
}
