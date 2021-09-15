import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ryba {
    public static void main(String[] args) {
        System.out.println("Kolik rybek si k večeři nabídneš koblížku?");

        Scanner sc = new Scanner(System.in);

        int phish = sc.nextInt();

        System.out.println("Tady máš čumáčku <3");

        for (int i = 0; i < phish; i++) {
            System.out.println("<° )))-<");
        }
    }
}
