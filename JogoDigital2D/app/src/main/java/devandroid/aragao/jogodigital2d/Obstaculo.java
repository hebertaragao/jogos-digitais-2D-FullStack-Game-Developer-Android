package devandroid.aragao.jogodigital2d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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

        this.posicao = posicao;
        this.cenario = cenario;

        this.alturaDoObstaculoInferior = cenario.getAltura() - TAMANHO_DO_OBSTACULO - gerarValorAleatorio();
        this.alturaDoObstaculoSuperior = TAMANHO_DO_OBSTACULO + gerarValorAleatorio();

        Bitmap bp = BitmapFactory.decodeResource(context.getResources(), R.drawable.objeto_obstaculo);

        this.obstaculoInferior = Bitmap.createScaledBitmap(bp, LARGURA_DO_OBSTACULO, this.alturaDoObstaculoInferior, false);
        this.obstaculoSuperior = Bitmap.createScaledBitmap(bp, LARGURA_DO_OBSTACULO, this.alturaDoObstaculoSuperior, false);

    }
    public void adicionarObstaculoNoCenario(Canvas canvas){
        desenharObstaculoInferiorNoCenario(canvas);
        desenharObstaculosSuperiorNoCenario(canvas);
    }

    public void desenharObstaculoInferiorNoCenario(Canvas canvas){}
    public void desenharObstaculosSuperiorNoCenario(Canvas canvas){}
    public void movimentarObstaculo(){}
    public int gerarValorAleatorio(){return 0;}

    public int getPosicao() {return posicao;}
    public boolean verificarSeObstaculoSaiuDoCenario(){return true;}

    public boolean verificarColisaoVertical(){return true;}
    public boolean verificarPosicaoHorizontal(){return true;}
}
