package com.example.elefante_afnc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListAnimalActivity extends AppCompatActivity {
    private ArrayList<String> nombres_animales;

    private Integer[] id_imagenes_animanes = {
            R.drawable.leon,
            R.drawable.cebra,
            R.drawable.hipopotamo,
            R.drawable.hiena,
            R.drawable.caiman,
            R.drawable.suricata,
            R.drawable.jirafa,
            R.drawable.elefante64,
            R.drawable.rinoceronte
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ListView list_view_animales;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_animal);

        list_view_animales = findViewById(R.id.list_view_animales);

        nombres_animales = new ArrayList<String>();
        nombres_animales.add("Leon");
        nombres_animales.add("Cebra");
        nombres_animales.add("Hipopotamo");
        nombres_animales.add("Hiena");
        nombres_animales.add("Caiman");
        nombres_animales.add("Suricata");
        nombres_animales.add("Jirafa");
        nombres_animales.add("Elefante");
        nombres_animales.add("Rinoceronte");

        //A D A P T E R
        /*
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                nombres_animales
        );
        */

        List_animal_adapter adapter;
        adapter = new List_animal_adapter(
                this, R.layout.item_list_animal, nombres_animales,
                id_imagenes_animanes
        );
        list_view_animales.setAdapter(adapter);

    }
}