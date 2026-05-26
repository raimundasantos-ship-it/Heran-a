package Exercicio3;
public class ProdutoImportado extends Produto {

    public ProdutoImportado(String descricao,double valor) {

        super(descricao, valor);
    }

    @Override
    public double calcularValorFinal() {

        return valor + (valor * 0.10)
                     + (valor * 0.05)
                     + (valor * 0.05);
    }
}