package descontoMulher;

public class Compra {

    private Double valor;

    private Cliente cliente;

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double desconto() {
        if (cliente.getIdade() >= 18 && cliente.getIdade() <= 35 && "F".equalsIgnoreCase(cliente.getSexo())) {
           return valor * 0.8;
        } else {
           return valor * 0.95;
        }
    }

    public String percentual() {
        if (cliente.getIdade() >= 18 && cliente.getIdade() <= 35 && "F".equalsIgnoreCase(cliente.getSexo())) {
            return "20%";
        } else {
            return "5%";
        }
    }
}
