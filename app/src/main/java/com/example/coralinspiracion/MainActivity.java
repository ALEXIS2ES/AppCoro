package com.example.coralinspiracion;

import android.os.Bundle;
import android.view.animation.AnimationUtils;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CoroAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(this, R.anim.layout_animation_fall_down));


        List<Coro> coros = new ArrayList<>();
        // Agregar 9 elementos a la lista
        coros.add(new Coro(R.drawable.icons8_m_sica, "Por ti Seré", "Coral Inspiracion"));
        coros.add(new Coro(R.drawable.icons8_m_sica, "Magnificad", "Coral Inspiracion"));
        coros.add(new Coro(R.drawable.icons8_m_sica, "Jerusalen", "Coral Inspiracion"));
        coros.add(new Coro(R.drawable.icons8_m_sica, "De Pie Cristiano", "Coral Inspiracion"));
        coros.add(new Coro(R.drawable.icons8_m_sica, "Dia Hermoso", "Coral Inspiracion"));
        coros.add(new Coro(R.drawable.icons8_m_sica, "Los Peregrinos", "Coral Inspiracion"));
        coros.add(new Coro(R.drawable.icons8_m_sica, "Mi Dios y Yo", "Coral Inspiracion"));
        coros.add(new Coro(R.drawable.icons8_m_sica, "Cuan Glorioso", "Coral Inspiracion"));
        coros.add(new Coro(R.drawable.icons8_m_sica, "Oracion", "Coral Inspiracion"));
        // ... agregar los demás elementos ...

        adapter = new CoroAdapter(coros, this);
        recyclerView.setAdapter(adapter);
    }
}