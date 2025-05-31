import java.util.Scanner;

class NotJavaFileException extends Exception {
    public NotJavaFileException(String message) {
        super(message);
    }
}

public class EXCEPTION002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            String fileName = sc.nextLine();
            try{
                System.out.println(Grader.checkFileExtension(fileName));
            } catch (NotJavaFileException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
class Grader {
    public static int checkFileExtension(String fileName) throws NotJavaFileException {
        if (fileName == null || fileName.trim().isEmpty()) {
            throw new NotJavaFileException("Not java file exception.Mark is -1");
        }
        if (fileName.toLowerCase().endsWith(".java")) {
            return 1;
        } else {
            return 0;
        }
    }
}
