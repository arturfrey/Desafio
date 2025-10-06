public class Tabuada {

    void imprimir(int numero, int limite) {
        for (int i = 1; i <= limite; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void main(String[] args) {
        Tabuada t = new Tabuada();
        t.imprimir(7, 10);
    }
}


