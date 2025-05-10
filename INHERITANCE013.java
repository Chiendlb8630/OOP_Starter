import java.util.Scanner;

class Teacher{
    String name;
    double baseSalary;

    public String getName(){
        return name;
    }

    public double getSalary(){
        return baseSalary;
    }

    public Teacher(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getInfo(){
        return "Họ tên: " + name;
    }
}

class PermanentLecturer extends Teacher{
    double researchAllowance;

    public PermanentLecturer(String name, double baseSalary, double researchAllowance){
        super(name, baseSalary);
        this.researchAllowance = researchAllowance;
    }

    @Override
    public double getSalary(){
        return baseSalary + researchAllowance;
    }

    @Override
    public String getInfo(){
        return
                "Loại giảng viên: Permanent\n" +
                        super.getInfo() + "\n" +
                        "Lương thực nhận: " + getSalary();
    }

}
class VisitingLecture extends Teacher{
    int teachingHours;
    double paymentPerHour;

    public VisitingLecture(String name, int teachingHours, double paymentPerHour) {
        super(name, 0);
        this.teachingHours = teachingHours;
        this.paymentPerHour = paymentPerHour;
    }

    @Override
    public double getSalary(){
        return teachingHours * paymentPerHour;
    }

    @Override
    public String getInfo() {
        return "Loại giảng viên: Visiting\n" +
                super.getInfo() + "\n" +
                "Lương thực nhận: " + getSalary();
    }
}


public class INHERITANCE013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String teachType1 = sc.nextLine();
        String name1 = sc.nextLine();
        Teacher teacher1 = null;
        if (teachType1.equals("PermanentLecturer")) {
            double baseSalary = Double.parseDouble(sc.nextLine());
            double allowance = Double.parseDouble(sc.nextLine());
            teacher1 = new PermanentLecturer(name1, baseSalary, allowance);
        } else if (teachType1.equals("VisitingLecturer")) {
            int hours = Integer.parseInt(sc.nextLine());
            double rate = Double.parseDouble(sc.nextLine());
            teacher1 = new VisitingLecture(name1, hours, rate);
        }


        String teachType2 = sc.nextLine();
        String name2 = sc.nextLine();
        Teacher teacher2 = null;
        if (teachType2.equals("PermanentLecturer")) {
            double baseSalary = Double.parseDouble(sc.nextLine());
            double allowance = Double.parseDouble(sc.nextLine());
            teacher2 = new PermanentLecturer(name2, baseSalary, allowance);
        } else if (teachType2.equals("VisitingLecturer")) {
            int hours = Integer.parseInt(sc.nextLine());
            double rate = Double.parseDouble(sc.nextLine());
            teacher2 = new VisitingLecture(name2, hours, rate);
        }

        System.out.println("--- Thông tin giảng viên ---");
        System.out.println(teacher1.getInfo());
        System.out.println(teacher2.getInfo());
    }
}
