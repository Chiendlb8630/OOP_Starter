package collect;

import java.util.HashMap;

class Product {
    int price;
    int stock;


    public Product(int price, int stock) {
        this.price = price;
        this.stock = stock;
    }
}

class Warehouse{
    private final HashMap<String,Product> inventory;

    public Warehouse(){
        inventory = new HashMap<>();
    }
    public void addProduct( String product, int price, int stock){
        inventory.put(product, new Product(price,stock));
    }
    public String price(String product){
        if(inventory.containsKey(product)){
            return  product + ": " + inventory.get(product).price;
        }
        else{
            return product + ": -99";
        }
    }
}

public class COLLECTION001 {
    public static void main(String[] args) {
        Warehouse wr = new Warehouse();

        wr.addProduct("milk",3,10 );
        wr.addProduct("coffee",5,7);

        System.out.println("prices:");
        System.out.println(wr.price("milk"));
        System.out.println(wr.price("coffee"));
        System.out.println(wr.price("sugar"));
    }
}
