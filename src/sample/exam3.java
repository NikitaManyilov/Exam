import java.util.Scanner;

public class exam3 {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        if (x % 10 > x / 10) System.out.println("Единиц больше");
        else if (x % 10 < x / 10) System.out.println("Десятков больше");
        else System.out.println("Поровну");

    }
}