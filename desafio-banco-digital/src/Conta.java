public abstract class Conta implements IConta {
    protected static final int AGENCIA_PADRAO = 0001;
    protected static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Agência: %d", agencia));
        System.out.println(String.format("Conta: %d", numero));
        System.out.println(String.format("Saldo: %.2f", saldo));
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }
}
