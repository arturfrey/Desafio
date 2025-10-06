public class VerificadorPrimo {

    public static void main(String[] args) {
        VerificadorPrimo v = new VerificadorPrimo();
        v.mostrarPrimos(1, 30);
    }

    void mostrarPrimos(int inicio, int fim) {
        for (int i = inicio; i <= fim; i++) {
            ehPrimo(i); 
        }
    }

    void ehPrimo(int n) {
        int cont = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cont++;
            }
        }

        if (cont == 2) {
            System.out.println(n + " é primo");
        }
    }
}
