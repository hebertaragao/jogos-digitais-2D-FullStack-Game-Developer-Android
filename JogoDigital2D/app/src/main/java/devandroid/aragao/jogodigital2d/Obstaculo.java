package devandroid.aragao.jogodigital2d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;

public class Obstaculo {
    public static final int LARGURA_DO_OBSTACULO = 150;
    public static final int TAMANHO_DO_OBSTACULO = 80;

    private int alturaDoObstaculoInferior;
    private int alturaDoObstaculoSuperior;
    private int posicao;

    private Cenario cenario;

    private Bitmap obstaculoInferior;
    private Bitmap obstaculoSuperior;

    public Obstaculo(Cenario cenario, int posicao, Context context){

    }
    public void adicionarCamada(Canvas canvas){}

    public void desenharObstaculoInferiorNaCamada(Canvas canvas){}
    public void desenharObstaculosSuperiorNaCamada(Canvas canvas){}
    public void movimentarObstaculo(){}
    public int gerarValorAleatorio(){return 0;}

    public int getPosicao() {return posicao;}
    public boolean verificarSeObstaculoSaiuDoCenario(){return true;}

    public boolean verificarColisaoVertical(){return true;}
    public boolean verificarPosicaoHorizontal(){return true;}
}
