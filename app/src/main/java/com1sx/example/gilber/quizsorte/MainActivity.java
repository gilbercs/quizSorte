package com1sx.example.gilber.quizsorte;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText edNum;
    private TextView txSorte;
    private Button btJogar;

    public void numSorteado(int num){
        String strNum;

        do {
            strNum = edNum.getText().toString();
            if (num == Integer.parseInt(strNum)){
                txSorte.setText("Parabens você acetou o Numer é: "+strNum);
            }else if (Integer.parseInt(strNum)<num){
                txSorte.setText("Numero sorteado é maior que: "+strNum);
            }else if (Integer.parseInt(strNum)>num){
                txSorte.setText("Numero sorteado é menor que: "+strNum);
            }
        }while (Integer.parseInt(strNum)==0);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNum = (EditText)findViewById(R.id.idNum);
        btJogar = (Button)findViewById(R.id.idBtnJogar);
        txSorte = (TextView) findViewById(R.id.idTxSorte);
        Random gerarNum = new Random();
        final int num = gerarNum.nextInt(10);

        btJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numSorteado(num);
            }
        });


    }
}
