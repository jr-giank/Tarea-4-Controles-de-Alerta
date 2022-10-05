package com.example.tarea4;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class editarInformacionLayout extends AppCompatActivity {

    EditText nombre, institucion, materia;

    Button guardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_informacion_layout);

        nombre = findViewById(R.id.nombre);
        institucion = findViewById(R.id.institucion);
        materia = findViewById(R.id.materia);
        guardar = findViewById(R.id.guardar);

//        guardar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                nombre.setText("Holaaaaaaaaaaa");
//                institucion.setText(institucion.getText());
//                materia.setText(materia.getText());
//
//                Intent i = new Intent(editarInformacionLayout.this, MainActivity.class);
//                startActivity(i);
//            }
//        });
    }
}