package com.apps.proyectofinalapps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityEspera  extends AppCompatActivity {

    private Button btn_regresar;
    private Button btn_mensaje;
    private Button btn_llamar;
    private TextView nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_espera);

        btn_regresar= findViewById(R.id.id_btnregresar);
        btn_mensaje = findViewById(R.id.id_texto);
        btn_llamar= findViewById(R.id.id_llamar);
        nombre = findViewById(R.id.nombre);

        btn_regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityEspera.this, ActivityMenu.class);
                startActivity(i);
            }
        });


    }
}
