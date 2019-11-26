package com.apps.proyectofinalapps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityRegistro extends AppCompatActivity {

    private Button btn_regresar;
    private Button btn_registrar;
    private EditText nombre;
    private EditText correo;
    private EditText contraseña;
    private EditText contraseña2;
    private EditText ciudad;
    private EditText barrio;
    private EditText especificaciones;
    private EditText direccion;
    private EditText num1;
    private EditText num2;

    private Spinner dia;
    private Spinner mes;
    private Spinner año;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        btn_regresar = findViewById(R.id.id_btnregresar);
        btn_registrar= findViewById(R.id.id_registrarse);
        nombre = findViewById(R.id.id_nombre);
        correo = findViewById(R.id.id_correo);
        contraseña = findViewById(R.id.id_contraseña);
        contraseña2 = findViewById(R.id.id_contraseña2);
        ciudad = findViewById(R.id.id_ciudad);
        barrio = findViewById(R.id.id_barrio);
        especificaciones = findViewById(R.id.id_especificaciones);
        direccion = findViewById(R.id.id_direccion);
        num1 = findViewById(R.id.id_num1);
        num2 = findViewById(R.id.id_num2);
        dia= findViewById(R.id.id_dia);
        mes= findViewById(R.id.id_mes);
        año = findViewById(R.id.id_año);


        btn_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityRegistro.this, ActivityMenu.class);
                startActivity(i);
            }
        });

        btn_regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityRegistro.this, ActivityInicio.class);
                startActivity(i);

            }
        });

    }
}
