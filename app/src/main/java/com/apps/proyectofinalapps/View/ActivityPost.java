package com.apps.proyectofinalapps.View;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.apps.proyectofinalapps.R;

public class ActivityPost extends AppCompatActivity {

    private ImageButton foto1;
    private ImageButton foto2;
    private TextView nombre;
    private ImageView imagen;
    private TextView descripcion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);


        foto1 = findViewById(R.id.id_fotopost);
        foto2 = findViewById(R.id.foto2post);
        nombre = findViewById(R.id.id_nombrepost);
        imagen= findViewById(R.id.id_imagenpost);
        descripcion = findViewById(R.id.especificacionespost);



    }
}
