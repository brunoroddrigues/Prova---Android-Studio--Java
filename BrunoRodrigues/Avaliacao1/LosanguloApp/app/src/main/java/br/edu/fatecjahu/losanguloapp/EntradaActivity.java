package br.edu.fatecjahu.losanguloapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EntradaActivity extends AppCompatActivity {

    private EditText tDiagonalMaior;
    private EditText tDiagonalMenor;
    private EditText tLado;
    private Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrada);

        // Inicializar os EditTexts e o botão
        tDiagonalMaior = findViewById(R.id.edtText1);
        tDiagonalMenor = findViewById(R.id.edtText2);
        tLado = findViewById(R.id.edtText3);
        btnCalcular = findViewById(R.id.btnCalcular);

        // Definir o onClickListener para o botão
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obter os valores das diagonais e do lado dos campos de texto
                String strDiagonalMaior = tDiagonalMaior.getText().toString();
                String strDiagonalMenor = tDiagonalMenor.getText().toString();
                String strLado = tLado.getText().toString();

                if (!strDiagonalMaior.isEmpty() &&
                        !strDiagonalMenor.isEmpty() &&
                        !strLado.isEmpty()) {
                    // Criar uma Intent para iniciar a ResultadoActivity
                    Intent intent = new Intent(EntradaActivity.this, ResultadoActivity.class);


                    Bundle params = new Bundle();
                    params.putString("n1", strDiagonalMaior);
                    params.putString("n2", strDiagonalMenor);
                    params.putString("n3", strLado);



                    intent.putExtras(params);
                    startActivity(intent);

                    alert("Dados enviados com sucesso!!");
                }else
                {
                    //14. Mensagem de erro.
                    alert("Dados em branco ou inválidos!!!");
                }
            }

        });
    }



    // 7. Criando o Contexto.
    private Context getContext() {
        return this;
    }

    // 12. Criar o método alert.
    private void alert(String msg) {
        // 13. A classe Toast mostra um alerta temporário muito comum no Android.
        Toast toast = Toast.makeText(getContext(), msg, Toast.LENGTH_LONG);
        toast.setGravity(Gravity.BOTTOM, 0, 0);
        toast.show();

        // Toast.LENGTH_LONG tem a duração de 3 a 5 segundos da mensagem de TOAST.
        // Toast.LENGTH_SHORT tem a duração de 1 a 3 segundos da mensagem de TOAST.
    }
}
