package model;

import java.util.Date;

import utils.DataUtil;

public class Movimentacao {

    //#region atributos
    private String descricao;
    private Date dataMovimentacao;
    private Double valor;
    //#endregion
    

    public Movimentacao(String descricao, Double valor) {
        this.descricao = descricao;
        this.dataMovimentacao = new Date();
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Date getDataMovimentacao() {
        return dataMovimentacao;
    }

    public Double getValor() {
        return valor;
    }
   

    @Override
    public String toString(){

        String dataFormat = DataUtil.converteData(this.getDataMovimentacao());
        return "Operação: " + this.getDescricao() + "\nValor: R$" + this.getValor() + "\nData: " + dataFormat;
    }
    

}
