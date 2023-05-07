package devandroid.aragao.jogodigital2d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

public class Obstaculo {
    public static final int LARGURA_DO_OBSTACULO = 150;
    public static final int TAMANHO_DO_OBSTACULO = 80;

     int alturaDoObstaculoInferior;
     int alturaDoObstaculoSuperior;
     int posicao;

     Cenario cenario;

     Bitmap obstaculoInferior;
     Bitmap obstaculoSuperior;

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

    public void desenharObstaculoInferiorNoCenario(Canvas canvas){
        canvas.drawBitmap(obstaculoInferior, posicao,alturaDoObstaculoInferior, null);
    }
    public void desenharObstaculosSuperiorNoCenario(Canvas canvas){
        canvas.drawBitmap(obstaculoSuperior, posicao,0,null);
    }
    public void movimentarObstaculo(){
        posicao -= 5;
    }
    public int gerarValorAleatorio(){
        return (int) (Math.random()*150);}

    public int getPosicao() {return posicao;}
    public boolean verificarSeObstaculoSaiuDoCenario(){
        return posicao + LARGURA_DO_OBSTACULO  < 0;}

    public boolean verificarColisaoVertical(SpaceShip spaceShip){
        return spaceShip.getAltura() - SpaceShip.RAIO < this.alturaDoObstaculoSuperior
                || spaceShip.getAltura() + SpaceShip.RAIO > this.alturaDoObstaculoInferior;
    }
    public boolean verificarColisaoHorizontal(SpaceShip spaceShip){
        return this.posicao - spaceShip.hangar < SpaceShip.RAIO;
    }
}
