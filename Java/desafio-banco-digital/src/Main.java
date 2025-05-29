//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("XPTO");
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cc.depositar(100);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        banco.cadastrarCliente(new Cliente("João", "123.456.789-00"));
        banco.cadastrarCliente(new Cliente("Carlos", "456.126.522-53"));

        banco.listarClientes();
    }
}