package com.example.dm2.comunicacion;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Actividad1 extends AppCompatActivity {

    private EditText nombre, apellido;
    private TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle(R.string.app_name_2);
        setContentView(R.layout.activity_actividad1);

        nombre = findViewById(R.id.texto1);
        apellido = findViewById(R.id.texto2);
        texto = (TextView) findViewById(R.id.viewTex2);
    }

    public void condiciones(View view) {
        String datos = nombre.getText().toString() + " " + apellido.getText().toString();

        Intent intent_2 = new Intent(this , Condiciones.class);
        intent_2.putExtra("info" , datos );
        startActivityForResult(intent_2,2568);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        if ( requestCode == 2568  && resultCode == RESULT_OK ){
            String respuesta = data.getExtras().getString("resp");
            texto.setText( "Aceptas Condiciones " + respuesta );

        }

    }

    public void volver(View view) {
        finish();
    }
}
