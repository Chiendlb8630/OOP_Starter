import java.util.Scanner;

class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        setGender(gender);
    }

    public void setGender(char gender) {
        if (gender == 'm' || gender == 'f') {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Gender must be 'm' or 'f'");
        }
    }

    @Override
    public String toString() {
        return "Author[name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }
}

class Book {
    private String name;
    private double price;
    private int qty;
    private Author author;

    public Book(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book[name=" + name + ", " + author.toString() + ", price=" + price + ", qty=" + qty + "]";
    }
}

public class OOP012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        if (line.equals("End")) return;
        int testCase = Integer.parseInt(line);

        Book book = null;
        Author author = null;

        for (int i = 0; i < testCase; i++) {
            String type = sc.nextLine();
            if (type.equals("End")) return;

            if (type.equals("Book")) {
                String name = sc.nextLine();
                if (name.equals("End")) return;

                double price = Double.parseDouble(sc.nextLine());
                int qty = Integer.parseInt(sc.nextLine());

                book = new Book(name, price, qty);
            }
        }

        // Đọc tiếp Author
        String authorType = sc.nextLine();
        if (authorType.equals("End")) return;

        if (authorType.equals("Author")) {
            String authorName = sc.nextLine();
            if (authorName.equals("End")) return;

            String email = sc.nextLine();
            if (email.equals("End")) return;

            char gender = sc.nextLine().charAt(0);
            author = new Author(authorName, email, gender);
        }

        if (book != null && author != null) {
            book.setAuthor(author);
            System.out.println(book);
        }

        sc.close();
    }
}
