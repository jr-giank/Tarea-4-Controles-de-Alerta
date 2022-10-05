package com.example.tarea4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;

import com.example.tarea4.databinding.ActivityMainBinding;
import com.example.tarea4.databinding.FragmentFirstBinding;

public class FirstFragment extends AppCompatActivity {

//    private FragmentFirstBinding binding;
    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    EditText nombre, institucion, materia;
    Button guardar;
//
//    @Override
//    public View onCreateView(
//            LayoutInflater inflater, ViewGroup container,
//            Bundle savedInstanceState
//    ) {
//
////        binding = FragmentFirstBinding.inflate(inflater, container, false);
////        return binding.getRoot();
//
//        View view = inflater.inflate(R.layout.fragment_first, container, false);
//
//        nombre = view.findViewById(R.id.nombre);
//        institucion = view.findViewById(R.id.institucion);
//        materia = view.findViewById(R.id.materia);
//
//        guardar = view.findViewById(R.id.guardar);
//
//        guardar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                nombre.setText("Holaaaaaaaaaaaaa");
//                institucion.setText(institucion.getText());
//                materia.setText(materia.getText());
//            }
//        });
//
//        return view.getRootView();
//    }

//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        nombre = getView().findViewById(R.id.nombre);
//        institucion = getView().findViewById(R.id.institucion);
//        materia = getView().findViewById(R.id.materia);
//
//        guardar = getView().findViewById(R.id.guardar);
//
//        guardar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                nombre.setText("Holaaaaaaaaaaaaa");
//                institucion.setText(institucion.getText());
//                materia.setText(materia.getText());
//            }
//        });
//    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        nombre = findViewById(R.id.nombre);
        institucion = findViewById(R.id.institucion);
        materia = findViewById(R.id.materia);

        guardar = findViewById(R.id.guardar);

        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombre.setText("Holaaaaaaaaaaa");
                institucion.setText(institucion.getText());
                materia.setText(materia.getText());
            }
        });
    }
}