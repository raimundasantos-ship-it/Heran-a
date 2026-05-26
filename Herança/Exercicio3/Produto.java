package Exercicio3;

public class Produto {

    protected String descricao;
    protected double valor;

    public Produto(String descricao, double valor) {

        this.descricao = descricao;
        this.valor = valor;
    }

    public double calcularValorFinal() {

        return valor + (valor * 0.10);
    }
}