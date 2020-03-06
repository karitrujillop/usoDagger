package com.desafiolatam.casadagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.desafiolatam.casadagger.model.Casa;
import com.desafiolatam.casadagger.model.Habitaciones;
import com.desafiolatam.casadagger.model.Puertas;
import com.desafiolatam.casadagger.model.Ventanas;

public class MainActivity extends AppCompatActivity {

    private Casa casa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppComponent component = DaggerAppComponent.create();
        casa = component.getCasa();
        casa.construir();

    }
}
