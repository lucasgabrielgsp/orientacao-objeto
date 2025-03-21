public class EstruturaRepeticao {
    public static void main(String[] args) {
        // while
        int contador = 0;
        while (contador < 10) {
            System.out.println(contador);
            contador++;
        }

        // do while

        contador = 0;

        do {
            System.out.println(contador);
            contador++;
        } while (contador < 10);

        // for
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // for each

        String[] nomes = { "João", "Maria", "José" };

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
