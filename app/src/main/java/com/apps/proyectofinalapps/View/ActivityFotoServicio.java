package com.apps.proyectofinalapps.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.apps.proyectofinalapps.R;

public class ActivityFotoServicio extends AppCompatActivity {


    private Button btn_adelante;
    private Button btn_regresar;
    private Button btn_cancelar;
    private LinearLayout foto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fotoservicio);



        btn_adelante = findViewById(R.id.id_btnadelante);
        btn_regresar= findViewById(R.id.id_btnregresar);
        btn_cancelar= findViewById(R.id.id_btncancelar);
        foto= findViewById(R.id.foto);

        btn_adelante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityFotoServicio.this, ActivityServicioFinal.class);
                startActivity(i);
            }
        });

        btn_regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityFotoServicio.this, ActivityServicio.class);
                startActivity(i);
            }
        });



    }
}
