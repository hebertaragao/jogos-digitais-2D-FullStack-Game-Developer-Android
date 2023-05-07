package devandroid.aragao.jogodigital2d;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class Obstaculos {
    int QUANTIDADE_DE_OBSTACULOS = 50;
    int DISTANCIA_ENTRE_OBSTACULOS =150;

    List<Obstaculo> obstaculoList = new ArrayList<>();

    Cenario cenario;

    Pontuacao pontuacao;

    int maximo = 0;

    Context context;

    public Obstaculos(){}

    public void adicionarCamada(){}

    public void moverObstaculos(){}

    public boolean verificarColisao(){return true;}
}
