public class ContadorDigitos {

    public static void main(String[] args) {
        int numero = 123456;
        int pares = 0;
        int impares = 0;
        int temp = numero;

        while (temp > 0) {
            int ultimoDigito = temp % 10;

            if (ultimoDigito % 2 == 0) {
                pares = pares + 1;
            } else {
                impares = impares + 1;
            }

            temp = temp / 10;
        }

        System.out.println(pares + " pares, " + impares + " ímpares");
    }
}
