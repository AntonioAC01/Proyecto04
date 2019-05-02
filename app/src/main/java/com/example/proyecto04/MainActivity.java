package com.example.proyecto04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



private Button btnejercio01,btnejercio02,btnejercio03,btnejercio04;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnejercio01=findViewById(R.id.btnejercio01);
        btnejercio02=findViewById(R.id.btnejercio02);
        btnejercio03=findViewById(R.id.btnejercio03);
        btnejercio04=findViewById(R.id.btnejercio04);

        btnejercio01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Ejercicio1Activity.class);
                startActivity(intent);
            }
        });

        btnejercio02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ejercicio2Activity.class);
                startActivity(intent);
            }
        });

        btnejercio03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ejercicio3Activity.class);
                startActivity(intent);
            }
        });

        btnejercio04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ejercicio4Activity.class);
                startActivity(intent);
            }
        });
    }



}
