package Collection_3;

import java.util.HashMap;

class Item{
    String product;
    int quantity;
    int unitPrice;
    int originalQuantity;

    public Item(String product, int quantity, int originalQuantity){
        this.product = product;
        this.quantity = quantity;
        this.originalQuantity = originalQuantity;
    }


}

class Warehouse{
    HashMap<String, Item> items;
}
public class COLLECTION004 {
}
