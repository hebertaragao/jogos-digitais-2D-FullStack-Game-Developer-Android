package devandroid.aragao.jogodigital2d;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

public class Cenario {
    private DisplayMetrics metrics;
    public Cenario(Context context){
        WindowManager manager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = manager.getDefaultDisplay();
        metrics = new DisplayMetrics();
        display.getMetrics(metrics);

    }

    public int getLargura() {
        return metrics.widthPixels;
    }
    public int getAltura(){
        return metrics.heightPixels;
    }
}
