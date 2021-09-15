import java.util.Scanner;

public class Bin {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Zadej číslo a uvidíš ho v simsalabinární soustavě, ne trávicí.");

        int binumber = sc.nextInt();

        while(binumber > 0){
            System.out.print(binumber % 2);
            binumber = (binumber / 2);
        }
    }
}
