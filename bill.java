import java.util.Scanner;
public class bill {
    public static void main(String[] args)
    {
      Scanner s= new Scanner(System.in);
      System.out.println("enter your bijli units ");
      int bijli= s.nextInt();

      if (bijli<=50){
          double bill= (int) (bijli*0.50);
          bill = bill + (bill * 20 / 100);
          System.out.println("your bijli ka bill is "+bill);
      }
      else if (bijli>50 && bijli<=150) {
          double bill = bijli * 0.75;
          bill = bill + (bill * 20 / 100);
            System.out.println("your bijli bill is "+bill);
      }
      else if (bijli>150 && bijli<=250) {
          double bill = bijli * 1.20;
          bill = bill + (bill * 20 / 100);
          System.out.println("your bijli bill is "+bill);
      }
      else{
          double bill = bijli * 1.50;
          bill = bill + (bill * 20 / 100);
          System.out.println("your bijli bill is "+bill);
      }
    }
}
