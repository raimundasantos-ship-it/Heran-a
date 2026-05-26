package Exercicio3;
public class TesteProduto {

    public static void main(String[] args) {

        ProdutoEstadual p1 =new ProdutoEstadual("Teclado", 180);

        ProdutoNacional p2 =new ProdutoNacional("Mouse", 100);

        ProdutoImportado p3 =new ProdutoImportado("Notebook", 120);

        System.out.println("Estadual: " + p1.calcularValorFinal());
        System.out.println("Nacional: " + p2.calcularValorFinal());
        System.out.println("Importado: " + p3.calcularValorFinal());
    }
}
