package com.example.aluno.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonConvertor;

    private EditText editTextValor;

    private TextView textViewAlterador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewAlterador =   (TextView) findViewById(R.id.textViewAlterador);
        buttonConvertor = (Button) findViewById(R.id.buttonConvertor);
        editTextValor = (EditText) findViewById(R.id.editTextValor);

        buttonConvertor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String valor = editTextValor.getText().toString();
                double valorConvertido;

                valorConvertido = Double.parseDouble(valor) * 3.33;

                textViewAlterador.setText("" + valorConvertido);


            }
        });


    }
}
