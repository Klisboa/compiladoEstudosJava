package carrinhoDeCompras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarrinhoDeCompras {



    public static void main(String[] args) {


        Cliente c1 = new Cliente();
        c1.setNome("carol");
        c1.setEmail("Carol@gmail.com");

        Compra cp = new Compra();
        cp.setCliente(c1);

        cp.getItens().add(new Produto("camisa", 56.0, 5));
        cp.getItens().add(new Produto("saia", 63.0, 3));
        cp.getItens().add(new Produto("vestido", 120.0, 2));

        System.out.println("Nome do Cliente: " + cp.getCliente().getNome());
        System.out.println("Email: " + cp.getCliente().getEmail());

        for (int i = 0; i < cp.getItens().size(); i ++) {
            Produto item = cp.getItens().get(i);
            System.out.println("Itens do carrinho: " + item.getTipo() +
                    " / Preço: " + item.getPreco() +
                    " / Quantidade: " + item.getQuantidade());
        }
        System.out.println("Total da compra: " + cp.somaPreco());


    }


}
