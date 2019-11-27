package com.apps.proyectofinalapps.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.apps.proyectofinalapps.R;


public class ActivityServicio extends AppCompatActivity {

    private Button btn_grua;
    private Button btn_lavado;
    private Button btn_electrico;
    private Button btn_mecanico;
    private Button btn_atras;




    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicio);

        btn_grua = findViewById(R.id.id_grua);
        btn_lavado= findViewById(R.id.id_lavado);
        btn_electrico= findViewById(R.id.id_electrico);
        btn_mecanico= findViewById(R.id.id_mecanico);
        btn_atras = findViewById(R.id.id_btnregresar);

        btn_grua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityServicio.this, ActivityFotoServicio.class);
                 startActivity(i);
            }
        });

        btn_lavado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityServicio.this, ActivityFotoServicio.class);
                startActivity(i);
            }
        });

        btn_electrico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityServicio.this, ActivityFotoServicio.class);
                startActivity(i);
            }
        });

        btn_mecanico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityServicio.this, ActivityFotoServicio.class);
                startActivity(i);
            }
        });

        btn_atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityServicio.this, ActivityMenu.class);
                startActivity(i);
            }
        });


    }
}
