import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the month ");
        System.out.println("jan, feb, mar, apr, may, jun, jul, aug, sep, oct, nov, dec");
        String mahina = s.nextLine();

        if (mahina.equals("jan") || mahina.equals("mar") || mahina.equals("may") || mahina.equals("jul") || mahina.equals("aug") || mahina.equals("oct") || mahina.equals("dec"))
        {
            System.out.println("this mahina has 31 din");
        } else if (mahina.equals("feb")) {
            System.out.println("mahina has 28 diwas");
        }
        else {
            System.out.println("mahine me 30 din hai");
        }
    }
}