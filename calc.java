import java.util.Scanner;

import static java.lang.System.exit;

public class calc {
    public static void main(String[] args)
    {
        int a,b,c,z;
        Scanner s= new Scanner(System.in);
        do {
            System.out.println("Calculator");
            System.out.println("tu pehla pehla number hai mera~");
            a=s.nextInt();
            System.out.println("do ghut number ke maaro");
            b=s.nextInt();
            System.out.println("1)add   2)sub   3)multiply 4)div 5)exit");
            z=s.nextInt();

            switch (z){
                case 1 -> {
                    c=a+b;
                    System.out.println("dono ka addition ye le re baba " +c);
                    break;
                }
                case 2 -> {
                    c=a-b;
                    System.out.println("substracted value hai" +c);
                    break;
                }
                case 3 ->{
                    c=a*b;
                    System.out.println("a guni b hai" +c);
                    break;
                }
                case 4 ->{
                    c=a/b;
                    System.out.println("a bate b hai"+c);
                    break;
                }
                case 5 ->{
                    exit(0);
                }
                default -> System.out.println("kya kariyega itti beakli ka?" );
            }

        } while (true);

    }
}
