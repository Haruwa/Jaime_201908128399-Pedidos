public class Pedido {
    private String cliente;
    private int quantidade;

    Pedido(String cliente, int quantidade){
        this.cliente = cliente;
        this.quantidade = quantidade;
    }

    public String getCliente() {
        return cliente;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}