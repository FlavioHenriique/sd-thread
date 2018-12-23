package buffer;

public class ExemploBuffer implements Buffer {

    private int buffer = -1;

    public void set(int valor) {
        System.out.println("Produtor grava "+ buffer);
        buffer = valor;
    }

    public int get() {
        System.out.println("Consumidor le "+ buffer);
        return buffer;
    }
}
