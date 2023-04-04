import java.util .*;

public class check {
        public static void main(String[] args) {
            System.out.println("Check if input is Digit/Alphabet/Special Character");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a input");
            char ch = sc.next().charAt(0);
            if (Character.isLetter(ch)) {
                System.out.println(" Alphabet hai re baba.");
            } else if (ch >= '0' && ch <= '9') {
                System.out.println("paisa paisa");
            } else {
                System.out.println("Aukat ke bahar ha shabad hai.");
            }
        }
    }
