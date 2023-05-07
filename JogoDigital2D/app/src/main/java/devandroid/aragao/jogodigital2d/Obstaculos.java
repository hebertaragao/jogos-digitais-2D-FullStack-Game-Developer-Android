package devandroid.aragao.jogodigital2d;

import android.content.Context;
import android.graphics.Canvas;

import java.util.ArrayList;
import java.util.List;

public class Obstaculos {
    int QUANTIDADE_DE_OBSTACULOS = 50;
    int DISTANCIA_ENTRE_OBSTACULOS = 150;

    List<Obstaculo> obstaculoList = new ArrayList<>();

    Cenario cenario;

    Pontuacao pontuacao;

    Context context;

    int maximo = 0;
    int posicaoInicial = 0;

    public Obstaculos() {
        this.cenario = cenario;
        this.pontuacao = pontuacao;
        this.context = context;

        for (int i = 0; i < QUANTIDADE_DE_OBSTACULOS; i++) {
            posicaoInicial += DISTANCIA_ENTRE_OBSTACULOS;
            obstaculoList.add(new Obstaculo(cenario, posicaoInicial, context));
        }
        for (Obstaculo obstaculo : obstaculoList) {
            maximo = Math.max(obstaculo.getPosicao(), maximo);
        }
    }

    public void adicionarCamada(Canvas canvas) {
        for (Obstaculo obstaculo : obstaculoList) {
            obstaculo.adicionarObstaculoNoCenario(canvas);
        }
    }

    public void moverObstaculos() {
    }

    public boolean verificarColisao() {
        return true;
    }
}
