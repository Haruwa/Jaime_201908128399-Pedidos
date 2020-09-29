import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String itemNome;
        String itemPreco;
        float floatItemPreco;
        String pedidoQuant;
        int intPedidoQuant;
        String clienteNome;
        float valorTotal;


        System.out.println("Digite o nome do cliente: ");
        clienteNome = scanner.nextLine();

        System.out.println("Digite o item a ser pedido: ");
        itemNome = scanner.nextLine();
        System.out.println("\nDigite o preco do item: ");
        itemPreco = scanner.nextLine();
        floatItemPreco = Float.valueOf(itemPreco);

        Item item = new Item(itemNome, floatItemPreco);
        ItemView view = new ItemView();
        ItemController controller = new ItemController(item, view);
        controller.updateView();

        System.out.println("\nQual a quantidade deste item no pedido: ");
        pedidoQuant = scanner.nextLine();
        intPedidoQuant = Integer.valueOf(pedidoQuant);

        Pedido pedido = new Pedido(clienteNome, intPedidoQuant);
        PedidoView view2 = new PedidoView();
        PedidoController controller2 = new PedidoController(pedido, item, view2);
        valorTotal = controller2.calculaPedido(item.getPreco(), pedido.getQuantidade());

        controller2.updateView(valorTotal);

    }
}
