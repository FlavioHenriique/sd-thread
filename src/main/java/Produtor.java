import buffer.Buffer;

import java.util.Random;

public class Produtor implements Runnable {

    private static Random random = new Random();
    private Buffer compartilhada;

    public Produtor(Buffer compartilhada) {
        this.compartilhada = compartilhada;
    }

    public void run() {
        for (int k = 1; k <= 10; k++) {
            try {
                Thread.sleep(random.nextInt(3000));
                compartilhada.set(k);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Fim do produtor");
    }
}
