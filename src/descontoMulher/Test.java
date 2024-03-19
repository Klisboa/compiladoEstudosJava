package descontoMulher;

public class Test {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Marcia");
        cliente.setIdade(33);
        cliente.setSexo("F");

        Compra comp = new Compra();
        comp.setCliente(cliente);
        comp.setValor(500.0);


        System.out.println("Cliente: " + cliente.getNome() + " / Idade: " + cliente.getIdade()
                + " /Sexo: " + cliente.getSexo());
        System.out.println("valor do Produto: " + comp.getValor()
                + "/ valor a pagar: " + comp.desconto());

    }

}
