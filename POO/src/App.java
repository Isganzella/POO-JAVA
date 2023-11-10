import javax.xml.crypto.Data;

import model.ContaBancaria;
import model.ContaCorrente;
import model.ContaPoupanca;
import model.Movimentacao;
import utils.DataUtil;

public class App {
    public static void main(String[] args) {
        System.out.println("Criando nosso Banco Digital");
        System.out.println();


        ContaBancaria c1 = new ContaCorrente("0001", "7452", 5, 100.0);
       
        c1.depositar(250.00);
        c1.sacar(200.0);

       
        c1.imprimirSaldo();

    }


}
