package devandroid.aragao.jogodigital2d;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

public class GameOver {
    public static final Paint VERMELHO = Cores.corTextoPontos();

    private Cenario cenario;

    public GameOver(Cenario cenario){
        this.cenario = cenario;
    }
    public void adicionarCamada(Canvas canvas){
        String texto = "GAME OVER!";
        Rect limiteDoTexto = new Rect();
        VERMELHO.getTextBounds(texto, 0, texto.length(), limiteDoTexto);
        canvas.drawText(texto,(cenario.getLargura()/2)-300, cenario.getAltura(), VERMELHO);
    }
}
