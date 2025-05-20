import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Cliente> clientes;

    public Banco(String nome) {
        this.nome = nome;
        clientes = new ArrayList<>();
    }

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void listarClientes() {
        System.out.println("=========================");
        System.out.println("=== Lista de Clientes ===");
        System.out.printf("===     Banco %s    ===\n", nome);
        System.out.println("=========================");

        for (Cliente cliente : clientes) {
            System.out.printf("Nome: %s | CPF: %s\n", cliente.getNome(), cliente.getCpf());
        }
    }
}
