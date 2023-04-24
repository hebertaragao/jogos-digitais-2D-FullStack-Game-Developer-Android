package curso.aragao.jogoinfinito;

import android.util.Log;

public class Tarefa implements Runnable{
    boolean isRodando = true;

    int tempo;

    public Tarefa(int Tempo){
        this.tempo = tempo;

    }
    @Override
    public void run() {
        int contador = 0;
        while (isRodando){
            Log.i("LogTarefa", "Tarefa genérica rodando...");
            contador++;
            if(contador>tempo) isRodando = false;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void finalizarTarefa(){
        this.isRodando = false;
    }
}
