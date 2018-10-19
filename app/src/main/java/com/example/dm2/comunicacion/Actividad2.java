package com.example.dm2.comunicacion;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Actividad2 extends AppCompatActivity {

    int contAciertos = 0, contFallos = 0;
    EditText nume1 , nume2 , result;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        nume1  = (EditText) findViewById(R.id.num1);
        nume2  = (EditText) findViewById(R.id.num2);
        result = (EditText) findViewById(R.id.result);

        int num1 = (int) Math.round( Math.random()*100 );
        int num2 = (int) Math.round( Math.random()*100 );

        nume1.setText(num1+"");
        nume2.setText(num2+"");

        resultado = (TextView) findViewById(R.id.aciertos);

        String aciertos = getString(R.string.aciertos);
        String formateado = String.format(aciertos,contAciertos,contFallos);
        resultado.setText(formateado);
    }

    public void comprobar(View view) {
        String extra =result.getText().toString();
        Intent intent = new Intent(this , ResultadoOperacion.class);
        intent.putExtra("resultado" , extra);
        intent.putExtra("numero1" , nume1.getText().toString() );
        intent.putExtra("numero2" , nume2.getText().toString() );

        startActivityForResult(intent,1480);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode == 1480 && resultCode == RESULT_OK){
            boolean b = data.getExtras().getBoolean("resp");
            if(b)
                contAciertos++;
            else
                contFallos++;

            String aciertos = getString(R.string.aciertos);
            String formateado = String.format(aciertos,contAciertos,contFallos);
            resultado.setText(formateado);

            int num1 = (int) Math.round( Math.random()*100 );
            int num2 = (int) Math.round( Math.random()*100 );

            nume1.setText(num1+"");
            nume2.setText(num2+"");
            result.setText("");
        }


    }
}
