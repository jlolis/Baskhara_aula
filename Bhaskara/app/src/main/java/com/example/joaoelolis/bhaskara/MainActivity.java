package com.example.joaoelolis.bhaskara;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CalculaRaizes(View view){

        EditText editA, editB, editC;
        Double a, b, c;

        editA = findViewById(R.id.editTextValor1);
        editB = findViewById(R.id.editTextValor2);
        editC = findViewById(R.id.editTextValor3);

        a = Double.parseDouble(editA.toString());
        b = Double.parseDouble(editB.toString());
        c = Double.parseDouble(editC.toString());

        MathUtil m = new MathUtil();

        Double[] solucao = m.CalculaRaizesEq2Grau(a, b, c);

        TextView x1 = findViewById(R.id.x1);
        TextView x2 = findViewById(R.id.x2);

        if(solucao != null) {

            x1.setText("X1: " + solucao[0].toString());
            x2.setText("X2: " + solucao[1].toString());
        }else{
            x1.setText("Sem solucao no mundo dos Reais");
            x2.setText("Sem solucao no mundo dos Reais");
        }
    }
}
