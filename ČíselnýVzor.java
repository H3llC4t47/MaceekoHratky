import java.util.Scanner;

public class ČíselnýVzor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Zadej číslo a sleduj ty kouzla");

        String numero = sc.nextLine();

        for(int i = 0; i < numero.length(); i++) {
            System.out.println(numero.substring(0, numero.length() - i));
        }
    }
}
