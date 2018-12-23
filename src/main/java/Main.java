import buffer.Buffer;
import buffer.ExemploBuffer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(2);
        Buffer compartilhada = new ExemploBuffer();
    }
}

