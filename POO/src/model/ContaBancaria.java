package model;


import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;

public abstract class ContaBancaria {
    
    //#region atributos
    protected String agencia;
    protected String conta;
    protected Integer digito;
    protected Double saldo;
    protected ArrayList<Movimentacao> movimentacoes;
    protected Double VALOR_MINIMO_DEPOSITO = 10.00;
    protected Date dataAbertura;
    //#endregion atributos

    //#region constructors
    public ContaBancaria(String agencia, String conta, Integer digito, Double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;
        this.dataAbertura = new Date();
        this.movimentacoes = new ArrayList<Movimentacao>();

        Movimentacao movimentacao = new Movimentacao("Abertura de conta", 100.0);
        this.movimentacoes.add(movimentacao);
    }
    //#endregion

    //#region getters and setters
    public String getAgencia() {
        return agencia;
    }


    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }


    public String getConta() {
        return conta;
    }


    public void setConta(String conta) {
        this.conta = conta;
    }


    public Integer getDigito() {
        return digito;
    }


    public void setDigito(Integer digito) {
        this.digito = digito;
    }


    public Double getSaldo() {
        return saldo;
    }
    
    public Date getDataAbertura(){
        return dataAbertura;
    }

    //#endregion

    //#region metodos
    public void depositar(Double valor){
        if(valor < VALOR_MINIMO_DEPOSITO){
            throw new InputMismatchException("O valor minimo de deposito é R$" + VALOR_MINIMO_DEPOSITO);
        }
        this.saldo += valor;

        Movimentacao deposito = new Movimentacao("Deposito", valor);
        this.movimentacoes.add(deposito);
    }

    public Double sacar(Double valor){
        if(this.saldo < valor){
            throw new InputMismatchException("Saldo insuficiente para realizar a operação. Saldo disponivel R$" + this.saldo);
        }
        this.saldo -= valor;   
        Movimentacao saque = new Movimentacao("Saída de valor ", valor);
        this.movimentacoes.add(saque);     
        return valor;
       

    }

    public void transferir(Double valor, ContaBancaria contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
        
    }
    //#endregion

    public abstract void imprimirSaldo();

    
    

    

}
