public class ContaBancaria {

    private String cliente;
    private int numeroConta;
    protected double saldo;

    // Construtor
    public ContaBancaria(String cliente, int numeroConta, double saldo) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    // Método sacar
    public boolean sacar(double valor) {

        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }

        return false;
    }

    // Método depositar
    public void depositar(double valor) {
        saldo += valor;
    }

    // Mostrar dados
    public void mostrarDados() {

        System.out.println("Cliente: " + cliente);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo: " + saldo);
    }

    // Getter saldo
    public double getSaldo() {
        return saldo;
    }
}