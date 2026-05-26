package Exercicio2;
public class TestePeca {
    public static void main(String[] args) {

        Peca p1 = new Peca(100, 30);

        PecaImportada p2 =
                new PecaImportada(100, 30, 20);

        System.out.println("Preço peça comum: "+ p1.calcularPreco());

        System.out.println("Preço peça importada: "+ p2.calcularPreco());
    }
}