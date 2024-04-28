package br.edu.fatecjahu.losanguloapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {


    // 19. Criar os objetos java.
    TextView text1, text2, text3, text4, text5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        // Obter os valores passados da Intent
        // 15. Recebe o pacote vindo da intent de DadoActivity.
        Bundle args = getIntent().getExtras();

        // 18. Recebe os valores enviados por parâmetro
        Double diagonalMaior = Double.parseDouble(args.getString("n1"));
        Double diagonalMenor = Double.parseDouble(args.getString("n2"));
        Double lado = Double.parseDouble(args.getString("n3"));

        // Calcular a área do losango
        Double area = (diagonalMaior * diagonalMenor) / 2;

        // Calcular o perímetro do losango
        Double perimetro = 4 * lado;

        // Exibir os resultados em TextViews
        TextView tvResCampo1 = findViewById(R.id.tvResCampo1);
        tvResCampo1.setText(String.format("%.2f", diagonalMaior));

        TextView tvResCampo2 = findViewById(R.id.tvResCampo2);
        tvResCampo2.setText(String.format("%.2f", diagonalMenor));

        TextView tvResCampo3 = findViewById(R.id.tvResCampo3);
        tvResCampo3.setText(String.format("%.2f", lado));

        TextView tvResCampo4 = findViewById(R.id.tvResCampo4);
        tvResCampo4.setText(String.format("%.2f", area));

        TextView tvResCampo5 = findViewById(R.id.tvResCampo5);
        tvResCampo5.setText(String.format("%.2f", perimetro));
    }
}
