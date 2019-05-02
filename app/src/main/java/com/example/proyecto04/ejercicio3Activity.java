package com.example.proyecto04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ejercicio3Activity extends AppCompatActivity {

    private Spinner idcentromedico,idjornada;
    private Button btnbuscardoctor;
    private ToggleButton txtfecha;
    String[] listacentromedico = {"- Elige un Centro medico-", "San Antonio", "Juan Pablo"};
    String[] listajornada = {"- Elige una jornada-", "Trabajador","Paciente"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3);
        idcentromedico=findViewById(R.id.idcentromedico);
        idjornada=findViewById(R.id.idjornada);
        btnbuscardoctor=findViewById(R.id.btnbuscardoctor);
       txtfecha=findViewById(R.id.idtogle);

       llenar();

        btnbuscardoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ejercicio3Activity.this, "Doctor Encontrado", Toast.LENGTH_SHORT).show();
            }
        });

    }


    public void llenar() {
        idcentromedico.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,listacentromedico));
        idjornada.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,listajornada));

    }
}
