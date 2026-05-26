public class ContaEspecial extends ContaBancaria {

    private double limite;

    public ContaEspecial(String cliente,int numeroConta,double saldo,double limite) {

        super(cliente, numeroConta, saldo);

        this.limite = limite;
    }

    // Sobrescrita do método sacar
    @Override
    public boolean sacar(double valor) {

        if ((saldo + limite) >= valor) {

            saldo -= valor;
            return true;
        }

        return false;
    }

    @Override
    public void mostrarDados() {

        super.mostrarDados();

        System.out.println("Limite: " + limite);
    }
}