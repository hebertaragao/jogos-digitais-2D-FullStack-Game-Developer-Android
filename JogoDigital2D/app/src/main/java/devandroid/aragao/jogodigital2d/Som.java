package devandroid.aragao.jogodigital2d;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;

public class Som {
    private SoundPool soundPool;

    public static int MOVIMENTO;
    public static int COLISAO;
    public static int GAME_OVER; // AO COLIDIR OU PERDER TODAS AS VIDAS
    public static int FASE_01; // AO CONCLUIR 100 PONTOS
    public static int FASE_02; // AO CONCLUIR 200 PONTOS
    public static int HIGH_SCORE; // RECORDE DE PONTOS

    public Som(Context context){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            soundPool = new SoundPool.Builder().setMaxStreams(10).build();
        } else {
            soundPool = new SoundPool(3, AudioManager.STREAM_MUSIC, 0);
        }
        MOVIMENTO = soundPool.load(context, R.raw.pontos, 0);
        COLISAO = soundPool.load(context, R.raw.colisao, 0);
        GAME_OVER = soundPool.load(context, R.raw.game_over, 0);
        FASE_01 = soundPool.load(context, R.raw.fase01, 0);
        FASE_02 = soundPool.load(context, R.raw.fase01, 0);
        HIGH_SCORE = soundPool.load(context, R.raw.score, 0);
    }
    public void tocarSom(int som){
        soundPool.play(som, 0.1f, 0.1f, 1, 0,1);

    }
    public void tocarFalas(int som){
        soundPool.play(som, 1, 1, 1, 0, 1);

    }
}
