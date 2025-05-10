import java.util.Scanner;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void move ( int dx, int dy){
        this.x += dx;
        this.y += dy;
    }

    public double distanceTo(Point other) {
        int dx = this.x - other.x;
        int dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

public class OOP004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // số bộ test

        for (int i = 0; i < t; i++) {
            int xa = sc.nextInt();
            int ya = sc.nextInt();
            int xb = sc.nextInt();
            int yb = sc.nextInt();

            Point A = new Point(xa, ya);
            A.move(1,1);
            Point B = new Point(xb, yb);

            System.out.printf("%.2f\n", A.distanceTo(B));
        }
    }
}
