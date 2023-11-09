import javax.xml.crypto.Data;

import model.ContaBancaria;
import model.ContaPoupanca;
import model.Movimentacao;
import utils.DataUtil;

public class App {
    public static void main(String[] args) {
        System.out.println("Criando nosso Banco Digital");
        System.out.println();


        ContaBancaria c1 = new ContaPoupanca("0001", "7452", 5, 100.0);


        System.out.println("Saldo disponível R$:" + c1.getSaldo());

        c1.depositar(250.00);

        System.out.println("\nSaldo disponível R$:" + c1.getSaldo());


        System.out.println(c1.getDataAbertura());

        var formatado = DataUtil.converteData(c1.getDataAbertura());

        System.out.println(formatado);

        Movimentacao movimentacao = new Movimentacao("Saque", 100.00);

        System.out.println(movimentacao);

    }


}
