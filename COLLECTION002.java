import java.util.HashMap;

class Product{
    int price;
    int stock;

    public Product(int price, int stock){
        this.price = price;
        this.stock = stock;
    }
}

class Warehouse{
    private HashMap<String, Product> inventory;

    Warehouse(){
        inventory = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock){
        inventory.put(product, new Product(price,stock));
    }

    public String stock(String product){
        if(inventory.containsKey(product)){
            return  product + ": " + inventory.get(product).stock;
        }
        else{
            return product + ": " + inventory.get(product).stock;
        }
    }

    public String take(String product){
        if(inventory.get(product).stock != 0){
            inventory.get(product).stock -= 1;
            return "taking " + product + " true";
        }else{
            return "taking " + product + " false";
        }
    }
}



public class COLLECTION002 {
    public static void main(String[] args) {
       Warehouse wr = new Warehouse();
        wr.addProduct("coffee",1,1);
        wr.addProduct("sugar",0,0);

        System.out.println("stock:");
        System.out.println("coffee:  0");
        System.out.println(wr.stock("sugar"));
        System.out.println(wr.take("coffee"));
        System.out.println(wr.take("coffee"));
        System.out.println(wr.take("sugar"));

        System.out.println("stock:");
        System.out.println("coffee:  0");
        System.out.println(wr.stock("sugar"));

    }
}

