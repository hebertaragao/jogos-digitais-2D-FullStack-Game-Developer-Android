package devandroid.aragao.jogodigital2d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

public class SpaceShip {

    int hangar = 80;
    int altura = 120;

    public static final int RAIO = 55;

    private Som som;

    private Cenario cenario;

    private Context context;

    private Bitmap spaceShip;

    boolean isRodape = false;

    int bordaSuperior;

    public SpaceShip(Cenario cenario, Context context, Som som){
        this.cenario = cenario;
        this.som = som;
        this.context = context;

        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.space_ship);
        this.spaceShip = Bitmap.createScaledBitmap(bitmap, RAIO*2, RAIO*2, false);

    }

    public void adicionarCamada(Canvas canvas){
        canvas.drawBitmap(spaceShip,hangar - RAIO, altura, null);
    }

    public void navegacaoDown(){
        isRodape = altura - RAIO > cenario.getAltura();
        if (!isRodape){
            this.altura += 5;
        }
    }

    public void navegacaoUp(){
        bordaSuperior = altura - RAIO;
        if (bordaSuperior > 0){
            som.tocarSom(Som.MOVIMENTO);
            this.altura -= 100;
        }
    }

    public int getHangar() {
        return hangar;
    }

    public int getAltura() {
        return altura;
    }
}

