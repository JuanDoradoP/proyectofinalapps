package com.apps.proyectofinalapps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityPerfil extends AppCompatActivity {

    private Button btn_atras;
    private Button btn_configurar;
    private ImageButton foto;
    private TextView nombre;
    private TextView ciudad;
    private TextView puntuacion;
    private ListView posts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_perfil);


        btn_atras = findViewById(R.id.id_btnregresar);
        btn_configurar = findViewById(R.id.id_btnconfigurar);
        foto = findViewById(R.id.id_foto);
        nombre = findViewById(R.id.id_nombre);
        ciudad = findViewById(R.id.id_ciudad);
        puntuacion = findViewById(R.id.id_puntuacion);
        posts = findViewById(R.id.id_postsperfil);

        btn_atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityPerfil.this, ActivityMenu.class);
                startActivity(i);
            }
        });

    }
}
