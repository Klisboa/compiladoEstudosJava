package loja;

public class SistemaVendas {

    public static void main(String[] args) {

        Vendedor primeiro = new Vendedor();
        primeiro.setNome("camila");
        primeiro.setSalarioFixo(1950.0);
        primeiro.setTotalDeVendas(4200.0);


        System.out.println("Nome do vendedor: " + primeiro.getNome());
        System.out.println("Salario Fixo: " + primeiro.getSalarioFixo());
        System.out.println("Total em vendas: " + primeiro.getTotalDeVendas());
        System.out.println("Comissao do vendedor: " + primeiro.comissao());
        System.out.println("Salário a receber: " + primeiro.salarioFinal());
    }

}
