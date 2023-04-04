import java.util.Scanner;
public class leapyear {
    public static void main(String[] args)
    {
        System.out.println("saal de saale");
        Scanner s= new Scanner(System.in);
        int saal= s.nextInt();

        if (saal%4==0){
            System.out.println("saal lamba hai");
        }
        else
            System.out.println("saal kudta nahi hai");
    }
}
