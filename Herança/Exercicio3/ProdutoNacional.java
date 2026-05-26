package Exercicio3;
class ProdutoNacional extends Produto {

    public ProdutoNacional(String descricao, double valor) {

        super(descricao, valor);
    }

    @Override
    public double calcularValorFinal() {

        return valor + (valor * 0.10)
                     + (valor * 0.05);
    }
}