package com.example.dm2.a13_actividadespropuestas3;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText valor1;
    private EditText valor2;
    private TextView resultado;
    private Button btnSuma;
    private Button btnResta;
    private Button btnMulti;
    private Button btnDiv;
    private String tvalor1;
    private String tvalor2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSuma = (Button) findViewById(R.id.btnSuma);
        btnResta = (Button) findViewById(R.id.btnResta);
        btnMulti = (Button) findViewById(R.id.btnMulti);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        valor1 = (EditText) findViewById(R.id.valor1);
        valor2 = (EditText) findViewById(R.id.valor2);
        resultado = (TextView) findViewById(R.id.tResultado);
        btnSuma.setOnClickListener(this);
        btnResta.setOnClickListener(this);
        btnMulti.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        tvalor1 = String.valueOf(valor1.getText());
        int v1 = Integer.parseInt(tvalor1);
        tvalor2 = String.valueOf(valor2.getText());
        int v2 = Integer.parseInt(tvalor2);
        int res;
        if (v == btnSuma){
            res = v1 + v2;
            resultado.setText("RESULTADO: "+res);
        }
        if (v == btnResta){
            res = v1 - v2;
            resultado.setText("RESULTADO: "+res);
        }
        if (v == btnMulti){
            res = v1 * v2;
            resultado.setText("RESULTADO: "+res);
        }
        if (v == btnDiv){
            res = v1 / v2;
            resultado.setText("RESULTADO: "+res);
        }

    }
}
