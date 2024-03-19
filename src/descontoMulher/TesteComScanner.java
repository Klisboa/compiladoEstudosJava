package descontoMulher;

import java.util.Scanner;

public class TesteComScanner {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Compra compra = new Compra();
        compra.setCliente(cliente);

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor do produto ");
        compra.setValor(Double.parseDouble(entrada.nextLine()));

        System.out.println("Informe o nome do cliete ");
        cliente.setNome(entrada.nextLine());

        System.out.println("Informe a idade do cliete ");
        cliente.setIdade(Integer.parseInt(entrada.nextLine()));

        System.out.println("Informe o sexo do cliete ");
        cliente.setSexo(entrada.nextLine());

        System.out.println(cliente.getNome() + " , Você ganhou um desconto de " + compra.percentual() );
        System.out.println("Valor a pagar: " + compra.desconto());


    }
}
