package com.example.parcialhd2;


import android.os.Bundle;



import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.parcialhd2.adaptadores.adaptador_people;
import com.example.parcialhd2.clases.people;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    RecyclerView rcv_people;

    List<people> listaPeople = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv_people = findViewById(R.id.rcv_people);

        people p1 = new people("https://rickandmortyapi.com/api/character/avatar/80.jpeg","Niñita","Lived","Doll");
        people p2 = new people("https://rickandmortyapi.com/api/character/avatar/40.jpeg","Scorpion","Lived","Alien");
        people p3 = new people("https://rickandmortyapi.com/api/character/avatar/72.jpeg","Rick","Lived","Human");
        people p4 = new people("https://rickandmortyapi.com/api/character/avatar/100.jpeg","Pulga","Lived","Alien");
        people p5 = new people("https://rickandmortyapi.com/api/character/avatar/120.jpeg","Rick","Lived","Human");




        listaPeople.add(p1);
        listaPeople.add(p2);
        listaPeople.add(p3);
        listaPeople.add(p4);
        listaPeople.add(p5);




        rcv_people.setLayoutManager(new LinearLayoutManager(this));
        rcv_people.setAdapter(new adaptador_people(MainActivity.this,listaPeople));

    }
}