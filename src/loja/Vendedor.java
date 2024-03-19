package loja;

public class Vendedor {

    private String nome;
    private Double salarioFixo;
    private Double totalDeVendas;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(Double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public Double getTotalDeVendas() {
        return totalDeVendas;
    }

    public void setTotalDeVendas(Double totalDeVendas) {
        this.totalDeVendas = totalDeVendas;
    }


    public Double comissao() {
        return this.totalDeVendas * (15) / 100;
    }


    public Double salarioFinal() {
        return salarioFixo + comissao();
    }


}
