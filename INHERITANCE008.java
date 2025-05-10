class Person{
    String name;
    String address;

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String toString(){
        return name + " - " + address;
    }
}

class Student extends Person{
    int credits;

    public Student(String name, String address, int credits){
        super(name, address);
        this.credits = credits;
    }
    public void study(){
        credits++;
    }

    int getCredits(){
       return credits;
    }
    @Override
    public String toString(){
        return super.toString();
    }
}



public class INHERITANCE008 {
    public static void main(String[] args) {
        Student s = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028", 0);
        System.out.println(s.toString());
        System.out.println("Study credits " + s.getCredits());
        s.study();  // Học 1 lần
        System.out.println("Study credits " + s.getCredits());

    }
}
