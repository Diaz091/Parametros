package com.example.dm2.comunicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Condiciones extends AppCompatActivity {
    private TextView datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle(R.string.app_name_3);
        setContentView(R.layout.activity_condiciones);

        datos = (TextView) findViewById(R.id.viewText);
        String infor = getIntent().getExtras().getString("info");

        datos.setText("Hola " + infor.toUpperCase() + "¿Aceptas las condiciones?");

    }

    public void acep(View view) {

        Intent aceptar = new Intent();
        aceptar.putExtra("resp" , "ACEPTADO" );
        setResult( RESULT_OK , aceptar );
        finish();

    }

    public void recha(View view) {

        Intent rechazar = new Intent();
        rechazar.putExtra("resp" , "RECHAZADO" );
        setResult( RESULT_OK , rechazar );
        finish();

    }

}
