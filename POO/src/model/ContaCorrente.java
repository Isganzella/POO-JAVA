package model;

import utils.DataUtil;
import java.util.*;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String agencia, String conta, Integer digito, Double saldoInicial) {
        super(agencia, conta, digito, saldoInicial);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void imprimirSaldo() {
        System.out.println("**************************************");
        System.out.println("********* EXTRATO BANCÁRIO ***********");
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
