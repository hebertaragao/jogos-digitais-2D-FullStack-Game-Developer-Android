package devandroid.aragao.jogodigital2d;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
// Inicio de tela cheia
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        try {
            getSupportActionBar().hide();
        } catch (Exception e) {
            Log.e("LogGame", "onCreate:" + e.getMessage());
        }
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        //final da tela cheia

        constraintLayout = findViewById(R.id.container);

        GameEngine gameEngine = new GameEngine(this);
        constraintLayout.addView(gameEngine);
    }
}