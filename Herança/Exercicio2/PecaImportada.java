package Exercicio2;
public class PecaImportada extends Peca {

    private double taxas;

    public PecaImportada(double custo,double lucro,double taxas) {

        super(custo, lucro);

        this.taxas = taxas;
    }

    @Override
    public double calcularPreco() {

        return super.calcularPreco() + taxas;
    }
}