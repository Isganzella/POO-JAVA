import model.ContaBancaria;

public class App {
    public static void main(String[] args) {
        System.out.println("Criando nosso Banco Digital");
        System.out.println();


        ContaBancaria c1 = new ContaBancaria("0001", "7452", 5, 100.0);


        System.out.println("Saldo disponível R$:" + c1.getSaldo());

        c1.depositar(250.00);

        System.out.println("\nSaldo disponível R$:" + c1.getSaldo());


        c1.sacar(400.00);

    }


}
