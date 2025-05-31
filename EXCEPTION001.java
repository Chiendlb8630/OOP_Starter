import java.util.Scanner;

class Amount {
    String curency;
    int amount;

    public Amount( String curency, int amount){
        this.curency = curency;
        this.amount = amount;
    }

     public String getCurency(){
        return curency;
     }
     public int getAmount(){
        return amount;
     }

    public int add(Amount other){
        if(this.curency.equals(other.getCurency())){
            this.amount += other.getAmount();
            return this.amount;
        } else{
            throw new IllegalArgumentException("Currency doesn't match");
        }
    }
}


public class EXCEPTION001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            try {
        String line = sc.nextLine().trim();
        String[] part =line.split("\\s+");

        String cur1 = part[0];
        int amt1 = Integer.parseInt(part[1]);
        String cur2 = part[2];
        int amt2 = Integer.parseInt(part[3]);

        Amount a1 = new Amount(cur1,amt1);
        Amount a2 = new Amount(cur2,amt2);

        System.out.println(a1.add(a2));
        } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
