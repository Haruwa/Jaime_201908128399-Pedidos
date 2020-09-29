public class ItemController {
    
    private Item item;
    private ItemView view;

    public ItemController(Item item, ItemView view){
        this.item = item;
        this.view = view;
    }

    public void updateView(){
        view.dadosItem(item.getNome(), item.getPreco());
    }

}
