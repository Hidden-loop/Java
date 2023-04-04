import java.util.Scanner;
class stud{
    String firstName,lastName,prog;
    int age,smark,hsmarks;
    stud()
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("shubh naam bataiye");
        firstName=scn.nextLine();
        System.out.println("enter last name");
        lastName=scn.nextLine();
        System.out.println("enter age");
        age=scn.nextInt();
        System.out.println("enter secondary marks ");
        smark=scn.nextInt();
        System.out.println(" enter higher secondary marks");
        hsmarks=scn.nextInt();
    }
    stud(String firstName, String lastName, int age, int smark, int hsmarks)
    {
        this.firstName= firstName;
        this.lastName= lastName;
        this.age=age;
        this.smark=smark;
        this.hsmarks=hsmarks;
    }
    stud(String firstName, String lastName)
    {
        Scanner sc =new Scanner(System.in);
        this.firstName=firstName;
        this.lastName=lastName;
        System.out.println("enter age");
        age= sc.nextInt();
        System.out.println("enter secondary marks ");
        smark= sc.nextInt();
        System.out.println(" enter higher secondary marks");
        hsmarks= sc.nextInt();
    }
    void disp() {

        System.out.println(firstName +" "+lastName + " ");
        System.out.println("the age is "+age);
        System.out.println("secondary marks are " +smark+ " higher secondary marks are: "+hsmarks);
        System.out.println(prog);
    }
}
class progAdm extends stud{
    void check(){
        if (age>18 && age<60){
            if (hsmarks>90 )
                prog=("muba rakho BCA hua hai!");
            else if ( hsmarks>80 && hsmarks<=90) {
                prog=("CA ban sakte hai aap");
            } else if ( hsmarks>70 && hsmarks<=80) {

                prog=("ye bhi thik hai(arts)");
            }
            else
                prog=("kya kariyega aap itne uslessness ka");
        }
        else
            prog=("too late");
    }

    @Override
    void disp() {
        System.out.println(firstName +" ` " + prog);
    }
}
class conference extends progAdm{
char reg='N';
String track;

}
public class register {
    public static void main(String[] args){
        //stud s1=new stud();
        progAdm s5 = new progAdm();
       // s1.disp();
        s5.check();
        s5.disp();
       /* stud s2=new stud("joe","mama",69,420,469);
        //s2.stud();
        s2.disp();
        stud s3=new stud("mike","hawk");
        //s3.stud("mike","hawk");
        s3.disp(); */
    }
}