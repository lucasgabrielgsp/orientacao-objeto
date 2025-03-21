public class EstruturaFluxo {
    public static void main(String[] args) {
        int idade = 17;

        // if else
        if (idade >= 18) {
            System.out.println("Pode entrar");
        } else {
            System.out.println("Não pode entrar");
        }

        // ternary operator
        String status = idade >= 18 ? "Pode entrar" : "Não pode entrar";
        System.out.println(status);

        // switch case
        int mes = 3;
        switch (mes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            default:
                System.out.println("Mês inválido");
        }
    }
}
