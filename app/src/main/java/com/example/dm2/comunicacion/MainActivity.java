package com.example.dm2.comunicacion;

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

    public void act1(View view) {
        Intent intent_1 = new Intent(this , Actividad1.class);
        startActivity( intent_1 );
    }

    public void act2(View view) {
        Intent intent_2 = new Intent(this , Actividad2.class);
        startActivity( intent_2 );
    }

    public void act3(View view) {
        Intent intent_3 = new Intent( this , Actividad3.class);
        startActivity( intent_3 );
    }
}
