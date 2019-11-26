package com.apps.proyectofinalapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityInicio extends AppCompatActivity {

    private Button btn_registro;
    private Button btn_inicio;
    private EditText txt_nombre;
    private EditText txt_contraseña;
    private Button btn_recordar;
    private Button btn_olvidar;
    private Button btn_terminos;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciosesion);

        btn_registro = findViewById(R.id.id_botonregistro);
        btn_inicio= findViewById(R.id.id_botoniniciarsesion);
        txt_nombre= findViewById(R.id.id_nombre);
        txt_contraseña= findViewById(R.id.id_contraseña);
        btn_recordar= findViewById(R.id.id_botonrecordar);
        btn_olvidar= findViewById(R.id.id_botonolvidar);
        btn_terminos= findViewById(R.id.id_botonterminos);


        btn_registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityInicio.this, ActivityRegistro.class);
                startActivity(i);
            }
        });



        btn_inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityInicio.this, ActivityMenu.class);
                startActivity(i);
            }
        });
    }
}
