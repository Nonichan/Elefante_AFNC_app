package com.example.elefante_afnc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button_siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_siguiente = findViewById(R.id.btn_siguiente_main);
        button_siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(), "Bienvenido", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this,
                                                        ListAnimalActivity.class);
                startActivity(intent);
            }
        });
    }
}