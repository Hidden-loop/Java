import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        int num =s.nextInt();
        int temp=num;
        int k=0;

        while(num>0)
        {
            int rem=num%10;
            k=(k)+(rem*rem*rem);
            num=num/10;
        }
        if(temp==k){
            System.out.println("armstrong number hai");
        }
        else{
            System.out.println("kamzor number hai");
        }
    }
}
