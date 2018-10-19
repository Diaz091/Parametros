package com.example.dm2.comunicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

public class Actividad3 extends AppCompatActivity {

    private EditText    textoNombre ,   textoApellido;
    private RadioButton masculino   ,   femenino;
    private CheckBox    musica      ,   lectura ,   deporte ,   viajar;
    private String      sexo="algo";
    private ArrayList<String> afici = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3);

        textoNombre     = (EditText)    findViewById ( R.id.nombre   );
        textoApellido   = (EditText)    findViewById ( R.id.apellido );

        masculino       = (RadioButton) findViewById ( R.id.masc );
        femenino        = (RadioButton) findViewById ( R.id.fem  );

        musica          = (CheckBox)    findViewById ( R.id.musica   );
        lectura         = (CheckBox)    findViewById ( R.id.lectura  );
        deporte         = (CheckBox)    findViewById ( R.id.deportes );
        viajar          = (CheckBox)    findViewById ( R.id.viajar   );
    }

    public void enviarDatos(View view) {

        sexo = (masculino.isChecked() ) ?"Masculino":"Femenino";

        if( musica.isChecked() ){
            afici.add(musica.getText().toString() );
        }
        if( lectura.isChecked() ){
            afici.add( lectura.getText().toString());
        }
        if( deporte.isChecked() ){
            afici.add( deporte.getText().toString());
        }
        if( viajar.isChecked() ){
            afici.add( viajar.getText().toString());
        }

        Intent intent_3 = new Intent(this , SolicitudDatos.class);
            intent_3.putExtra("nombre"    , textoNombre.getText().toString()   );
            intent_3.putExtra("apellido"  , textoApellido.getText().toString() );
            intent_3.putExtra("sexo"      , sexo );
            intent_3.putExtra("aficiones" , afici);

            startActivity( intent_3 );





    }
}
