package com.example.dm2.comunicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultadoOperacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_operacion);


        int num1   = Integer.parseInt( getIntent().getExtras().getString("numero1") );
        int num2   = Integer.parseInt( getIntent().getExtras().getString("numero2") );
        int result = Integer.parseInt(getIntent().getExtras().getString("resultado") );

        boolean acierto = (num1 + num2 ) == result ;
        String st = String.format(getString(R.string.result), (acierto) ?"CORRECTO":"INCORRECTO");
        ((TextView) findViewById(R.id.txt1)).setText(st);
        Intent i = new Intent();
        i.putExtra("resp" , acierto);
        setResult(RESULT_OK , i );
    }



    public void volver(View view) {
        finish();
    }
}
