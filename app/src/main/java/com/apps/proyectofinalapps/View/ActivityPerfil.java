package com.apps.proyectofinalapps.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.apps.proyectofinalapps.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ActivityPerfil extends AppCompatActivity {

    private Button btn_atras;
    private Button btn_configurar;
    private ImageButton foto;
    private TextView nombre;
    private TextView ciudad;
    private TextView puntuacion;
    private ListView posts;
    private FirebaseDatabase db;
    private FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_perfil);
        db = FirebaseDatabase.getInstance();
        auth =FirebaseAuth.getInstance();

        btn_atras = findViewById(R.id.id_btnregresar);
        btn_configurar = findViewById(R.id.id_btnconfigurar);
        foto = findViewById(R.id.id_foto);
        nombre = findViewById(R.id.id_nombre);
        ciudad = findViewById(R.id.id_ciudad);
        puntuacion = findViewById(R.id.id_puntuacion);
        posts = findViewById(R.id.id_postsperfil);
        putInfo();
        btn_atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityPerfil.this, ActivityMenu.class);
                startActivity(i);

            }
        });

    }

    private void putInfo() {
        String uid = auth.getCurrentUser().getUid();
        DatabaseReference ref =db.getReference().child("users").child(uid);
        ref.child("name").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                nombre.setText(dataSnapshot.getValue().toString());}
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {}
        });
        ref.child("place").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                ciudad.setText(dataSnapshot.getValue().toString());}
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {}
        });
        ref.child("Value").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                puntuacion.setText(dataSnapshot.getValue().toString());}
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {}
        });
        //TODO: faltan más campos del Usuario: y se llaman de la misma forma

    }
}
