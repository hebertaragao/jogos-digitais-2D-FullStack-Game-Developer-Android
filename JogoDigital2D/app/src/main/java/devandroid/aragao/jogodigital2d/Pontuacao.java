package devandroid.aragao.jogodigital2d;

import android.graphics.Canvas;
import android.graphics.Paint;

public class Pontuacao {
    public static final Paint BRANCO = Cores.corTextoPontos();
    public static final Paint VIDAS = Cores.corTextoPontos();
    public static final Paint PONTUACAO = Cores.corTextoPontos();

    private int contadorDePontos = 0;
    private  int contadorDeVidas = 0;
    private Cenario cenario;

    public void adicionarCamada(Cenario cenario, Canvas canvas){
        canvas.drawText(String.valueOf(contadorDePontos), 100, 180, BRANCO);

        canvas.drawText(String.valueOf(contadorDeVidas), cenario.getLargura() - 200, 180, BRANCO);
        canvas.drawText("Score", 25, 80, BRANCO);
        canvas.drawText("lives", cenario.getLargura()- 220, 80, BRANCO);
        canvas.drawText("High Score", (cenario.getLargura()/2) - 100, 80, BRANCO);
        canvas.drawText(String.valueOf(contadorDePontos), (cenario.getLargura()/2) - 100, 180, BRANCO);

    }
    public void incrementarPontos(){
        this.contadorDePontos++;
    }

    public int getContadorDePontos() {
        return contadorDePontos;
    }
}
