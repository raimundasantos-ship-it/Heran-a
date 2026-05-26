package Exercicio2;

public class Peca {

    protected double custo;
    protected double lucro;

    public Peca(double custo, double lucro) {

        this.custo = custo;
        this.lucro = lucro;
    }

    public double calcularPreco() {

        return custo + lucro;
    }
}