public class Contas {
public static void main(String[] args) {

        ContaBancaria conta1 =
                new ContaBancaria("Marta",
                101,
                1000);

        ContaPoupanca poupanca = new ContaPoupanca("Caio",
         202, 
         2000, 2400);

        ContaEspecial especial =
                new ContaEspecial("Hugo",
                        303,
                        500,
                        1000);

        conta1.depositar(200);

        conta1.sacar(100);

        poupanca.calcularNovoSaldo(0.05);

        especial.sacar(1200);

        System.out.println("=== Conta Comum ===");
        conta1.mostrarDados();

        System.out.println();

        System.out.println("=== Conta Poupança ===");
        poupanca.mostrarDados();

        System.out.println();

        System.out.println("=== Conta Especial ===");
        especial.mostrarDados();
    }
}