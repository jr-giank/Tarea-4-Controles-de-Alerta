package com.example.tarea4;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.tarea4.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    //Inicializando variables
    ImageView image;

    CheckBox astronauta, caballo, auto, musica;

    Button info, editar_info;

    EditText nombre, institucion, materia;

    LinearLayout texto_editar;

    RelativeLayout relativeLayout;

    SwipeListener swipeListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //Variables
        image = findViewById(R.id.imagen);

        astronauta = findViewById(R.id.astronauta);
        caballo = findViewById(R.id.caballo);
        auto = findViewById(R.id.auto);
        musica = findViewById(R.id.musica);

        info = findViewById(R.id.info);
        editar_info = findViewById(R.id.editar_info);

        nombre = findViewById(R.id.nombre);
        institucion = findViewById(R.id.institucion);
        materia = findViewById(R.id.materia);

        texto_editar = findViewById(R.id.texto_editar);

        relativeLayout = findViewById(R.id.relative_layout);
        swipeListener = new SwipeListener(relativeLayout);

        //CheckBoxes
        astronauta.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(astronauta.isChecked() && auto.isChecked() && !caballo.isChecked() && !musica.isChecked()) {
                    image.setImageResource(R.drawable.autoastronauta);
                }else if(!astronauta.isChecked() && auto.isChecked() && !caballo.isChecked() && !musica.isChecked()){
                    image.setImageResource(R.drawable.auto);
                }else if(astronauta.isChecked() && !auto.isChecked() && !caballo.isChecked() && musica.isChecked()){
                    image.setImageResource(R.drawable.astronautamusica);
                }else if(!astronauta.isChecked() && !auto.isChecked() && !caballo.isChecked() && musica.isChecked()){
                    image.setImageResource(R.drawable.musica);
                }else if (astronauta.isChecked() && !auto.isChecked() && !caballo.isChecked() && !musica.isChecked()){
                    image.setImageResource(R.drawable.astronauta);
                }else if (astronauta.isChecked() && !auto.isChecked() && caballo.isChecked() && !musica.isChecked()){
                    image.setImageResource(R.drawable.caballoastronauta);
                }else if(!astronauta.isChecked() && auto.isChecked() && !caballo.isChecked() && musica.isChecked()){
                    image.setImageResource(R.drawable.automusica);
                }else if(!astronauta.isChecked() && !auto.isChecked() && caballo.isChecked() && musica.isChecked()){
                    image.setImageResource(R.drawable.caballomusica);
                }else if (!astronauta.isChecked() && !auto.isChecked() && caballo.isChecked() && !musica.isChecked()){
                    image.setImageResource(R.drawable.caballo);
                }else if(!astronauta.isChecked() && auto.isChecked() && caballo.isChecked() && !musica.isChecked()){
                    image.setImageResource(R.drawable.caballoauto);
                }else{
                    image.setImageResource(R.drawable.notimage);
                }
            }
        });

        caballo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(astronauta.isChecked() && !auto.isChecked() && caballo.isChecked() && !musica.isChecked()) {
                    image.setImageResource(R.drawable.caballoastronauta);
                }else if(astronauta.isChecked() && auto.isChecked() && !caballo.isChecked() && !musica.isChecked()) {
                    image.setImageResource(R.drawable.autoastronauta);
                }else if(!astronauta.isChecked() && !auto.isChecked() && caballo.isChecked() && musica.isChecked()){
                    image.setImageResource(R.drawable.caballomusica);
                }else if(!astronauta.isChecked() && auto.isChecked() && caballo.isChecked() && !musica.isChecked()) {
                    image.setImageResource(R.drawable.caballoauto);
                }else if(!astronauta.isChecked() && !auto.isChecked() && caballo.isChecked() && !musica.isChecked()){
                    image.setImageResource(R.drawable.caballo);
                }else if(astronauta.isChecked() && !auto.isChecked() && !caballo.isChecked() && musica.isChecked()){
                    image.setImageResource(R.drawable.astronautamusica);
                }else if(astronauta.isChecked() && !auto.isChecked() && !caballo.isChecked() && !musica.isChecked()){
                    image.setImageResource(R.drawable.astronauta);
                }else if(!astronauta.isChecked() && auto.isChecked() && !caballo.isChecked() && musica.isChecked()){
                    image.setImageResource(R.drawable.automusica);
                }else if (!astronauta.isChecked() && auto.isChecked() && !caballo.isChecked() && !musica.isChecked()) {
                    image.setImageResource(R.drawable.auto);
                }else if(!astronauta.isChecked() && !auto.isChecked() && !caballo.isChecked() && musica.isChecked()){
                    image.setImageResource(R.drawable.musica);
                }else{
                    image.setImageResource(R.drawable.notimage);
                }
            }
        });

        auto.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(astronauta.isChecked() && auto.isChecked() && !caballo.isChecked() && !musica.isChecked()) {
                    image.setImageResource(R.drawable.autoastronauta);
                }else if(!astronauta.isChecked() && auto.isChecked() && !caballo.isChecked() && !musica.isChecked()){
                    image.setImageResource(R.drawable.auto);
                }else if(astronauta.isChecked() && !auto.isChecked() && !caballo.isChecked() && musica.isChecked()){
                    image.setImageResource(R.drawable.astronautamusica);
                }else if(!astronauta.isChecked() && auto.isChecked() && !caballo.isChecked() && musica.isChecked()){
                    image.setImageResource(R.drawable.automusica);
                }else if(!astronauta.isChecked() && !auto.isChecked() && !caballo.isChecked() && musica.isChecked()){
                    image.setImageResource(R.drawable.musica);
                }else if(!astronauta.isChecked() && auto.isChecked() && caballo.isChecked() && !musica.isChecked()) {
                    image.setImageResource(R.drawable.caballoauto);
                }else if(!astronauta.isChecked() && !auto.isChecked() && caballo.isChecked() && !musica.isChecked()) {
                    image.setImageResource(R.drawable.caballo);
                }else if(!astronauta.isChecked() && !auto.isChecked() && caballo.isChecked() && musica.isChecked()){
                    image.setImageResource(R.drawable.caballomusica);
                }else if(astronauta.isChecked() && !auto.isChecked() && !caballo.isChecked() && !musica.isChecked()){
                    image.setImageResource(R.drawable.astronauta);
                }else if (astronauta.isChecked() && !auto.isChecked() && caballo.isChecked() && !musica.isChecked()){
                    image.setImageResource(R.drawable.caballoastronauta);
                }else{
                    image.setImageResource(R.drawable.notimage);
                }
            }
        });

        musica.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(astronauta.isChecked() && !auto.isChecked() && !caballo.isChecked() && musica.isChecked()) {
                    image.setImageResource(R.drawable.astronautamusica);
                }else if(astronauta.isChecked() && auto.isChecked() && !caballo.isChecked() && !musica.isChecked()) {
                    image.setImageResource(R.drawable.autoastronauta);
                }else if(astronauta.isChecked() && !auto.isChecked() && !caballo.isChecked() && musica.isChecked()){
                    image.setImageResource(R.drawable.astronautamusica);
                }else if(!astronauta.isChecked() && auto.isChecked() && !caballo.isChecked() && musica.isChecked()){
                    image.setImageResource(R.drawable.automusica);
                }else if(!astronauta.isChecked() && !auto.isChecked() && caballo.isChecked() && musica.isChecked()){
                    image.setImageResource(R.drawable.caballomusica);
                }else if(!astronauta.isChecked() && auto.isChecked() && caballo.isChecked() && !musica.isChecked()) {
                    image.setImageResource(R.drawable.caballoauto);
                }else if(astronauta.isChecked() && !auto.isChecked() && !caballo.isChecked() && !musica.isChecked()){
                    image.setImageResource(R.drawable.astronauta);
                }else if (!astronauta.isChecked() && !auto.isChecked() && caballo.isChecked() && !musica.isChecked()){
                    image.setImageResource(R.drawable.caballo);
                }else if (!astronauta.isChecked() && auto.isChecked() && !caballo.isChecked() && !musica.isChecked()){
                    image.setImageResource(R.drawable.auto);
                }else if (astronauta.isChecked() && !auto.isChecked() && caballo.isChecked() && !musica.isChecked()){
                    image.setImageResource(R.drawable.caballoastronauta);
                }else if (!astronauta.isChecked() && !auto.isChecked() && !caballo.isChecked() && musica.isChecked()){
                    image.setImageResource(R.drawable.musica);
                }else{
                    image.setImageResource(R.drawable.notimage);
                }
            }
        });

        info.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

                builder.setTitle("Informacion")
                        .setIcon(R.drawable.imagen)
                        .setMessage("Nombre: " + nombre.getText() +
                            " Institución: " + institucion.getText() +
                            " Materia: " + materia.getText()
                )
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        editar_info.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(texto_editar.getVisibility() == View.VISIBLE){
                    texto_editar.setVisibility(View.GONE);
                }else{
                    texto_editar.setVisibility(View.VISIBLE);
                }
            }
        });

    }

    private class SwipeListener implements View.OnTouchListener{
        //Inicializando varible
        GestureDetector gestureDetector;

        //Creando constructor
        SwipeListener(View view) {
            int threshold = 100;
            int velocity_threshold = 100;

            GestureDetector.SimpleOnGestureListener listener =
                    new GestureDetector.SimpleOnGestureListener() {
                        @Override
                        public boolean onDown(MotionEvent e) {
                            return true;
                        }

                        @Override
                        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
                            float xDiff = e2.getX() - e1.getX();
                            float yDiff = e2.getY() - e1.getY();

                            try {
                                if (Math.abs(xDiff) > Math.abs(yDiff)) {
                                    if (Math.abs(xDiff) > threshold && Math.abs(velocityX) > velocity_threshold) {
                                        if (xDiff > 0) {
                                            finish();
                                        } else {
                                        }
                                    }
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }

                            return false;
                        }
                    };
            gestureDetector = new GestureDetector(listener);

            view.setOnTouchListener(this);
        }

        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return gestureDetector.onTouchEvent(motionEvent);
        }
    }
}