package com.example.proyecto04;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class ejercicio4Activity extends AppCompatActivity {


    private TextInputEditText txttarjeta, txtcodigo, txtvalida, txtnombres, txtdocumento;
    private Spinner idspiner;
    private Button btnguardar;
    String[] listatipo = {"- Elige un Tipo-", "DNI", "Pasaporte"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio4);
        txttarjeta = findViewById(R.id.txttarjeta);
        txtcodigo = findViewById(R.id.txtcodigo);
        txtvalida = findViewById(R.id.txtvalida);
        txtnombres = findViewById(R.id.txtnombres);
        txtdocumento = findViewById(R.id.txtdocumento);
        idspiner = findViewById(R.id.idspiner);
        btnguardar = findViewById(R.id.btnguardar);

        btnguardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txttarjeta.getText().equals("")) {
                    txttarjeta.setError("Falta Texto");
                }
                if (txtcodigo.getText().equals("")) {
                    txtcodigo.setError("Falta Codigo");
                }
                if (txtvalida.getText().equals("")) {
                    txtvalida.setError("Falta Validar Fecha");
                }
                if (txtnombres.getText().equals("")) {
                    txtnombres.setError("Falta Nombre");
                }
                if (txtdocumento.getText().equals("")) {
                    txtdocumento.setError("Falta Documento");
                }

                Toast.makeText(ejercicio4Activity.this, "Gracias", Toast.LENGTH_SHORT).show();
            }
        });
        llenar();
    }
    public void llenar() {
        idspiner.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,listatipo));


    }
}
