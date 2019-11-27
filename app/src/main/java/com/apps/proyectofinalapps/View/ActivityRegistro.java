package com.apps.proyectofinalapps.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.apps.proyectofinalapps.Entity.User;
import com.apps.proyectofinalapps.custom.ScrolledDatePicker;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;


import androidx.appcompat.app.AppCompatActivity;

import com.apps.proyectofinalapps.R;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ActivityRegistro extends AppCompatActivity {

    private Button btn_regresar;
    private Button btn_registrar;
    private EditText nombre;
    private EditText correo;
    private EditText contraseña;
    private EditText contraseña2;
    private ScrolledDatePicker age;





    FirebaseAuth auth;
    FirebaseDatabase db;


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
        age = findViewById(R.id.id_age);




        auth = FirebaseAuth.getInstance();
        db = FirebaseDatabase.getInstance();


        btn_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityRegistro.this, ActivityMenu.class);
                startActivity(i);


                if (correo.getText().toString().trim().isEmpty()) {
                    Toast.makeText(ActivityRegistro.this, "El campo de email esta vacio", Toast.LENGTH_LONG).show();
                    return;
                }

                if (!contraseña.getText().toString()
                        .equals(contraseña2.getText().toString())) {
                    Toast.makeText(ActivityRegistro.this, "Las contraseñas NO coinciden", Toast.LENGTH_LONG).show();
                    return;
                }

                if (contraseña.getText().toString().trim().length() < 6) {
                    Toast.makeText(ActivityRegistro.this, "Las contraseñas debe tener mínimo 6 carácteres", Toast.LENGTH_LONG).show();
                    return;
                }

                auth.createUserWithEmailAndPassword(
                        correo.getText().toString().trim(),
                        contraseña.getText().toString().trim()
                ).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(Task<AuthResult> task) {
                        try {
                            if (task.isSuccessful()) {
                                //Ya estamos logeados

                                String birth = age.getYear()
                                        + "-" + (age.getMonth() + 1)
                                        + "-" + age.getDayOfMonth();
                                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

                                Date date = sdf.parse(birth);


                                User user = new User(
                                        auth.getCurrentUser().getUid(),
                                        nombre.getText().toString(),
                                        correo.getText().toString(),
                                        birth,
                                        date.getTime(),
                                        contraseña.getText().toString()
                                );

                              //  db.getReference().child("users").child(user.getUid())
                                //        .setValue(user);





                            } else {
                                Toast.makeText(ActivityRegistro.this, "" + task.getException(), Toast.LENGTH_LONG).show();
                            }
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                    }
                });

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
