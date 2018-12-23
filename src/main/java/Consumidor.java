import buffer.Buffer;

import java.util.Random;

public class Consumidor implements Runnable {

    private static Random random = new Random();
    private Buffer compartilhada;

    public Consumidor(Buffer compartilhada) {
        this.compartilhada = compartilhada;
    }

    public void run() {
        int soma = 0;
        for (int k = 0; k <= 10; k++) {
            try {
                Thread.sleep(random.nextInt(3000));
                soma += compartilhada.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Fim do consumidor. Soma = " + soma);
    }
}
