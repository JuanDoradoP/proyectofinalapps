package com.apps.proyectofinalapps.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.apps.proyectofinalapps.R;

public class ActivityServicioFinal extends AppCompatActivity {

    private Button btn_regresar;
    private Button btn_ubicacionactual;
    private Button btn_otraubicacion;
    private Button pedirservicio;
    private EditText ciudad;
    private EditText barrio;
    private EditText especificaciones;
    private EditText direccion;
    private EditText num1;
    private EditText num2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serviciofinal);


        btn_regresar = findViewById(R.id.id_btnregresar);
        btn_ubicacionactual = findViewById(R.id.id_ubicacionactual);
        btn_otraubicacion = findViewById(R.id.id_otraubicacion);
        pedirservicio = findViewById(R.id.id_pedirservicio);
        ciudad = findViewById(R.id.id_ciudad);
        barrio = findViewById(R.id.id_barrio);
        especificaciones = findViewById(R.id.id_especificaciones);
        direccion = findViewById(R.id.id_direccion);
        num1 = findViewById(R.id.id_num1);
        num2 = findViewById(R.id.id_num2);


        btn_regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityServicioFinal.this, ActivityFotoServicio.class);
                startActivity(i);
            }
        });

        pedirservicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityServicioFinal.this, ActivityEspera.class);
                startActivity(i);
            }
        });
    }

}
