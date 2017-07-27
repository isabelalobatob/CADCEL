package com.example.isabela.cadcel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirCadastro(View view) {
        Intent intent = new Intent(MainActivity.this, cadastro.class);
        startActivity( intent );
    }

    public void abrirLoginCad(View view) {
        Intent intent = new Intent(MainActivity.this, LoginCad.class);
        startActivity( intent );
    }

    public void abrirConsulta(View view) {
        Intent intent = new Intent(MainActivity.this, Consulta.class);
        startActivity( intent );
    }
}
