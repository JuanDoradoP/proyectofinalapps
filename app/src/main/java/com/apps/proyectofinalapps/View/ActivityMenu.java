package com.apps.proyectofinalapps.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.apps.proyectofinalapps.R;

public class ActivityMenu extends AppCompatActivity {

    private Button perfilTv;
    private Button busquedaTv;
    private Button servicioTv;
   private FragmentManager manager;
    private FragmentTransaction ft;
    private LinearLayout container;
    private ListView posts;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menus);

       manager = getSupportFragmentManager();
       ft = manager.beginTransaction();



        perfilTv = findViewById(R.id.id_btnusuario);
        busquedaTv= findViewById(R.id.id_btnsearch);
        servicioTv= findViewById(R.id.id_btnservicio);
        container = findViewById(R.id.fragment_container);
        posts = findViewById(R.id.id_listapost);


        perfilTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityMenu.this, ActivityPerfil.class);
                startActivity(i);
            }
        });



        busquedaTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityMenu.this, ActivityBusqueda.class);
                startActivity(i);
            }
        });



        servicioTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityMenu.this, ActivityServicio.class);
                startActivity(i);
            }
        });

    }


}

