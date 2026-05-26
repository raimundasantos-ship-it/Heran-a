public class ContaPoupanca extends ContaBancaria {

    private int diaRendimento;

    public ContaPoupanca(String cliente, int numeroConta,double saldo, int diaRendimento) {

        super(cliente, numeroConta, saldo);

        this.diaRendimento = diaRendimento;
    }

    // Método para atualizar saldo
    public void calcularNovoSaldo(double taxa) {

        saldo += saldo * taxa;
    }

    @Override
    public void mostrarDados() {

        super.mostrarDados();

        System.out.println("Dia rendimento: " + diaRendimento);
    }
}