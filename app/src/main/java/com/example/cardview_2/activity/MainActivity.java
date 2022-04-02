package com.example.cardview_2.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cardview_2.R;
import com.example.cardview_2.adapter.PostagemAdapter;
import com.example.cardview_2.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //layout
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerPostagem.setLayoutManager( layoutManager );

        //Adapter
        prepararPostagens();

        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);

    }

    public void prepararPostagens(){

        Postagem p;
        p = new Postagem("Rumores", "DK",R.drawable.rato);
        postagens.add( p );
        p = new Postagem("Zika", "DK",R.drawable.gingerbrea);
        postagens.add( p );
        p = new Postagem("Duskwinter", "DK",R.drawable.images);
        postagens.add( p );
        p = new Postagem("Rodlol", "Mago",R.drawable.hump);
        postagens.add( p );

    }

}