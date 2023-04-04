public class allForOne {

    public static void main(String[] args){

        sabkaBaap a2= new sabkaBaap();
        sabkaBaap a3= new sabkaBaap("joker", 9.99F);

        a3.display();
    }
}

class sabkaBaap {
    sabkaBaap() {
        System.out.println("jhug jhug gadi");
    }

    int no;
    String name;

    String naam;
    float rating;

    sabkaBaap(String n, float r) {
        naam = n;
        rating = r;
    }
    void display() {
        System.out.println(no + " sahi movie " + name);
        System.out.println(naam + "  ki rating hai  " + rating);
    }
}