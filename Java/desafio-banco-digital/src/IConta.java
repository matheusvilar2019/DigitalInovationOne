public interface IConta {
    // Essa interface não é necessária. Apenas para fins didáticos
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta contaDestino);
    void imprimirExtrato();
}
