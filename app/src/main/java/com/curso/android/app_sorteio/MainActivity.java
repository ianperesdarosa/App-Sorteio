package com.curso.android.app_sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sortearNumero(View view){
        TextView texto = findViewById(R.id.textoDeResultado);
        int num = new Random().nextInt(11);

        texto.setText("Resultado:" + num);
    }
}