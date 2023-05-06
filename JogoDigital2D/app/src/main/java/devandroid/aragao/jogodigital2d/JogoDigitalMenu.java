package devandroid.aragao.jogodigital2d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class JogoDigitalMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo_digital_menu);

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        Cenario cenario = new Cenario(this);
        Som som = new Som(this);

        som.tocarFalas(1);
        som.tocarSom(2);

        Intent intent = new Intent(JogoDigitalMenu.this, MainActivity.class);
        startActivity(intent);
    }
}