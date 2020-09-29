import java.lang.reflect.Method;

public class PedidoController {

    private Pedido pedido;
    private PedidoView view;

    public PedidoController(Pedido pedido, Item item, PedidoView view){
        this.pedido = pedido;
        this.view = view;
    } 

    public float calculaPedido(float itemPreco, int quantidadePedido){
         float calculopedido = itemPreco * quantidadePedido;
         return calculopedido;        
    }

    public void updateView(float valorTotal){
        view.PedidoView(pedido.getCliente(), pedido.getQuantidade(), valorTotal);
    }
}
