package com.example.proyecto04;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ejercicio2Activity extends AppCompatActivity {


    private TextInputEditText txtnombr,txtcontra;
    private Button btnentrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);
        txtnombr=findViewById(R.id.txtnombr);
        txtcontra=findViewById(R.id.txtcontra);
        btnentrar=findViewById(R.id.btnentrar);

        btnentrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtnombr.getText().equals("") & txtcontra.getText().equals("")){
                    txtnombr.setError("Debe ingresar un usuario");
                    txtcontra.setError("Debe ingresar una contraseña");
                }else{
                    Toast.makeText(ejercicio2Activity.this, "Debe llenar los datos", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
