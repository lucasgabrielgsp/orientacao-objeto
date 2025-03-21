public class ContaBancaria {
    String titular;
    Integer saldo;
    String tipoDeConta;

    public ContaBancaria(String titular, Integer saldo, String tipoDeConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.tipoDeConta = tipoDeConta;
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Fulano", 1000, "Corrente");
        ContaBancaria conta2 = new ContaBancaria("Ciclano", 500, "Poupança");
        conta.sacar(500);
        conta.depositar(200);
        conta.transferir(conta2, 300);
        conta.exibirSaldo();
    }

    public void sacar(Integer valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso. Saldo atual: " + this.saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(Integer valor) {
        this.saldo += valor;
        System.out.println("Depósito de " + valor + " realizado com sucesso. Saldo atual: " + this.saldo);
    }

    public void transferir(ContaBancaria contaDestino, Integer valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            contaDestino.saldo += valor;
            System.out.println("Transferência de " + valor + " realizada com sucesso. Saldo atual: " + this.saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: " + this.saldo);
    }

}
