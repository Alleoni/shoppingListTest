package listacompras;

public class Compras {

    private Integer valor;
    private Cliente cliente;

    public Compras() {

    }

    public Compras(Integer valor, Cliente cliente) {
        this.valor = valor;
        this.cliente = cliente;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Cliente: " + cliente + " valor compra:" + valor + '}';
    }

}
