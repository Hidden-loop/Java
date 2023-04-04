import java.util.Scanner;

class student {
    String fname, lname, program;
    int age, smarks, hsmarks;

    void register() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        fname = sc.nextLine();
        System.out.println("enter last name");
        lname = sc.nextLine();
        System.out.println("enter age");
        age = sc.nextInt();
        System.out.println("enter SSC marks");
        smarks = sc.nextInt();
        System.out.println("enter HSC marks");
        hsmarks = sc.nextInt();
    }

    void register(String fname, String lname, int age, int smarks, int hsmarks) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.smarks = smarks;
        this.hsmarks = hsmarks;
    }

    void disp() {
        System.out.println("the name is " + fname + " sirname is " + lname);
        System.out.println("age is " + age);
        System.out.println("SSC marks are: " + smarks + " HSC marks are: " + hsmarks);
        System.out.println("program allocated is: " + program);
    }
}

class program extends student {
    void check() {
        if (hsmarks > 90)
            program = "BCA";
        else if (hsmarks > 80 && hsmarks <= 90) {
            program = "bba";
        } else if (hsmarks > 70 && hsmarks >= 80) {
            program = "llb";
        } else
            program = "not aplicable";
    }
}

class conferenc extends program {
    char reg = 'n';
    String papertitle;

    void reg() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter paper title");
        papertitle = s.nextLine();
        reg = 'y';
    }

    void disp() {
        super.disp();
        System.out.println("the paper title is: " + papertitle);
        System.out.println("registration: " + this.reg);
    }

}

public class regis {
    public static void main(String[] args) {
//        student s1=new student();
//        s1.register();
//        s1.disp();
//
//        program p1=new program();
//        p1.register();
//        p1.check();
//        p1.disp();

        conferenc c1 = new conferenc();
        c1.register();
        c1.check();
        c1.reg();
        c1.disp();
    }
}
