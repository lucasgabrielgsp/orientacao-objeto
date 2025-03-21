public class Carro {
    String chassi;
    String motor;
    String marca;
    String modelo;
    Integer ano;
    Integer quantidadePorta;

    public Carro(String chassi, String motor, String marca, String modelo, Integer ano, Integer quantidadePorta) {
        this.chassi = chassi;
        this.motor = motor;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.quantidadePorta = quantidadePorta;
    }

    public static void main(String[] args) {
        Carro carro = new Carro("123456789", "1.0", "Fiat", "Uno", 2021, 4);
        carro.ligarCarro();
        carro.acelerar();
        carro.frear();
        carro.virar("direita");
        carro.buzinar();
        carro.ligarFarol();
        carro.desligarFarol();
        carro.ligarPiscaAlerta();
        carro.desligarPiscaAlerta();
        carro.ligarArCondicionado();
        carro.desligarArCondicionado();
        carro.desligarCarro();
        carro.portas();
    }

    public void acelerar() {
        System.out.println("Acelerando...");
    }

    public void frear() {
        System.out.println("Freando...");
    }

    public void virar(String direcao) {
        System.out.println("Virando para " + direcao);
    }

    public void buzinar() {
        System.out.println("Buzinando...");
    }

    public void ligarFarol() {
        System.out.println("Farol ligado...");
    }

    public void desligarFarol() {
        System.out.println("Farol desligado...");
    }

    public void ligarPiscaAlerta() {
        System.out.println("Pisca alerta ligado...");
    }

    public void desligarPiscaAlerta() {
        System.out.println("Pisca alerta desligado...");
    }

    public void ligarArCondicionado() {
        System.out.println("Ar condicionado ligado...");
    }

    public void desligarArCondicionado() {
        System.out.println("Ar condicionado desligado...");
    }

    public void ligarCarro() {
        System.out.println("Carro ligado...");
    }

    public void desligarCarro() {
        System.out.println("Carro desligado...");
    }

    public void portas() {
        System.out.println("Quantidade de portas: " + quantidadePorta);
    }

}
