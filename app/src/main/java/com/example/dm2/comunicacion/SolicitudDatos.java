package com.example.dm2.comunicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class SolicitudDatos extends AppCompatActivity {

    private TextView nombre ,   apellido    ,   sexo    ,   aficiones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitud_datos);

        nombre      = (TextView) findViewById( R.id.nombreS );
        apellido    = (TextView) findViewById( R.id.apellidoS );
        sexo        = (TextView) findViewById( R.id.sexoS );
        aficiones   = (TextView) findViewById( R.id.aficionS );

        Intent recibirDatos = getIntent();
        ArrayList<String> str = recibirDatos.getExtras().getStringArrayList("aficiones");

        String aficion ="";
        for (String afi : str ) {
            aficion += afi+" ";
        }

        System.out.print(recibirDatos.getExtras().getString("sexo"));
        nombre.setText("Nombre: " + recibirDatos.getExtras().getString("nombre"));
        apellido.setText("Apellidos: " + recibirDatos.getExtras().getString("apellido"));
        sexo.setText("Sexo: " +recibirDatos.getExtras().getString("sexo"));
        aficiones.setText("Aficiones: "+ aficion);
    }


}
