package Collection_2;

import java.util.HashMap;
import java.util.Set;

class Warehouse{
    private HashMap< String, Integer> prices;
    private HashMap<String, Integer> stocks;

    public Warehouse(){
        this.prices = new HashMap<>();
        this.stocks = new HashMap<>();
    }

    public void addProduct( String product, int price, int stock){
        this.prices.put( product, price);
        this.stocks.put(product, stock);
    }

    public int price( String product){
        return this.prices.getOrDefault(product, -99);
    }

    public int stock( String product){
        return this.stocks.getOrDefault(product, 0);
    }

    public boolean take( String product){
        if(! this.stocks.containsKey(product) || this.stocks.get(product)== 0 ){
            return false;
        }
        this.stocks.put(product,this.stocks.get(product) -1);
        return true;
    }

    public Set<String> products(){
        return this.stocks.keySet();
    }
}



public class COLLECTION003 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("milk",3,10);
        warehouse.addProduct("coffee",5,6 );
        warehouse.addProduct("buttermilk",2,2);
        warehouse.addProduct("yogurt",2,20);

        warehouse.take("buttermilk");
        warehouse.take("milk");
        warehouse.take("buttermilk");

        for( String product : warehouse.products()){
        int stock = warehouse.stock(product);
        if(stock > 0){
            System.out.println(product);
        }
        }
    }
}
