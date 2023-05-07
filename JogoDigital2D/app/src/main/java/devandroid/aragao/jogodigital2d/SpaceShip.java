package devandroid.aragao.jogodigital2d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;

public class SpaceShip {

    int hangar = 80;
    int altura = 120;

    static final int RAIO = 55;

    private Som som;

    private Cenario cenario;

    private Bitmap spaceShip;

    boolean isRodape = false;

    int bordaSuperior;

    public SpaceShip(Cenario cenario, Context context, Som som){}

    public void adicionarCamada(Canvas canvas){}

    public void navegacaoDown(){}

    public void navegacaoUp(){}

    public int getHangar() {
        return hangar;
    }

    public int getAltura() {
        return altura;
    }
}

