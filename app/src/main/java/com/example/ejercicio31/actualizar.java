package com.example.ejercicio31;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class actualizar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actualizar);
    }

    public void Volver2(View View){

        Intent volver2 = new Intent(this,MainActivity.class);
        startActivity(volver2);
    }
}