package model;


import java.util.Date;
import java.util.InputMismatchException;

public abstract class ContaBancaria {
    
    //#region atributos
    private String agencia;
    private String conta;
    private Integer digito;
    private Double saldo;
    private Double VALOR_MINIMO_DEPOSITO = 10.00;
    private Date dataAbertura;
    //#endregion atributos

    //#region constructors
    public ContaBancaria(String agencia, String conta, Integer digito, Double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;
        this.dataAbertura = new Date();
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
    }

    public Double sacar(Double valor){
        if(this.saldo < valor){
            throw new InputMismatchException("Saldo insuficiente para realizar a operação. Saldo disponivel R$" + this.saldo);
        }
        this.saldo -= valor;        
        return valor;

    }

    public void transferir(Double valor, ContaBancaria contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }


    //#endregion

    
    

    

}
