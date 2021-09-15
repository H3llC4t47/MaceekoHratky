import java.util.Scanner;

public class Čára {
    public static void main(String[] args) {
        System.out.println("Zadej číslo, které vyjádří délku čáry, lajny, pika...znáš to.");

        Scanner sc = new Scanner(System.in);

        int line = sc.nextInt();

        for (int i = 0; i < line; i++) {
            System.out.print(".");
        }
    }
}
