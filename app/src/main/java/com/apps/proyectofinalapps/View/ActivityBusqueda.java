package com.apps.proyectofinalapps.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.apps.proyectofinalapps.R;


public class ActivityBusqueda extends AppCompatActivity {

    private EditText txt_busqueda;
    private Button cancelar;
    private Button buscar;
    private Button VariablePrueba;



    private ListView listabusqueda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busqueda);


        txt_busqueda = findViewById(R.id.id_txtbusqueda);
        cancelar= findViewById(R.id.id_btncancelar);
        buscar = findViewById(R.id.id_btnsearch);
        listabusqueda = findViewById(R.id.id_listabusqueda);


        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityBusqueda.this, ActivityMenu.class);
                startActivity(i);
            }
        });


    }
}
