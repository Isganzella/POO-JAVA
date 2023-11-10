package model;
import java.util.*;
import utils.DataUtil;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String agencia, String conta, Integer digito, Double saldoInicial) {
        super(agencia, conta, digito, saldoInicial);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void imprimirSaldo() {
        System.out.println("**************************************");
        System.out.println("**** EXTRATO BANCÁRIO POUPANÇA *******");
        System.out.println("**************************************");
        System.out.println();
        System.out.println("Gerado em: " + DataUtil.converteData(new Date()));

        for (Movimentacao movimentacao : this.movimentacoes) {
            System.out.println(movimentacao);
            System.out.println();
        }
        System.out.println();
        System.out.println("**************************************");
        System.out.println("**************************************");
        System.out.println("**************************************");

    }
    
}
