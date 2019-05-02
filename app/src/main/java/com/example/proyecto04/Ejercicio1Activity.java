package com.example.proyecto04;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Ejercicio1Activity extends AppCompatActivity {

    private Spinner ideligemusica, ideligegenero;
    private TextInputEditText txtnombre, txtanio, txtgrupo;
    private Button btnatrasbutton, btnsavebutton2;
    String[] listamusica = {"- Elige una Musica-", "A dios le pido", "Por fin te encontre", "Todo Cambio", "Un mundo de Locos"};
    String[] listagenero = {"- Elige un Genero-", "Reggeton", "Pop", "Romactic", ""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);
        ideligemusica = findViewById(R.id.ideligemusica);
        ideligegenero = findViewById(R.id.ideligegenero);
        txtnombre = findViewById(R.id.txtnombre);
        txtanio = findViewById(R.id.txtanio);
        txtgrupo = findViewById(R.id.txtgrupo);
        btnatrasbutton = findViewById(R.id.btnatrasbutton);
        btnsavebutton2 = findViewById(R.id.btnsavebutton2);
        btnatrasbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Ejercicio1Activity.this, "Datos Correctos", Toast.LENGTH_SHORT).show();

            }
        });
        llenar();
    }



    public void llenar() {
        ideligemusica.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,listamusica));
        ideligegenero.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,listagenero));
    }
}
