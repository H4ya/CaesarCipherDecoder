//This is a simple code to decode the cryptic messages you have using Caesar cipher! (might get upgraded later)
import java.util.Scanner;

public class Decode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Paste your message here(right click in terminal, don't use enter): ");
        String encodedMSg = sc.nextLine();
        int number = -1;
        while (number != 0) {
            System.out.println("Enter the number that will be skipped (use negative if you're going counterclockwise):");
            number = sc.nextInt();
            String decoded = "";
            int ascii;
            for (int i = 0; i < encodedMSg.length(); i++) {
                if (encodedMSg.charAt(i) != ' ' && encodedMSg.charAt(i) != ',' && encodedMSg.charAt(i) != '.'
                        && encodedMSg.charAt(i) != '?' && encodedMSg.charAt(i) != '#') { // I'm too lazy to do the
                                                                                         // shorter version
                    ascii = (int) encodedMSg.charAt(i);
                    decoded += (char) (ascii - number);
                } else
                    decoded += encodedMSg.charAt(i);
            }
            System.out.println("Here's your msg after decoding:\n--------------------------");
            System.out.println(decoded);
            System.out.println("--------------------------");
            System.out.println("note: enter 0 if you decoded the msg successfully, or ");
        }
        System.out.println("Thanks for using my system:)");
        sc.close();
    }
}
