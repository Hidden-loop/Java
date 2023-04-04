public class cinema {
    String naam;
    float rating;
    cinema(String n, float r){
        naam = n;
        rating=r;
    }
    void disp(){System.out.println(naam+"  ki rating hai  " +rating);}

    public static void main(String[] args){
        cinema a=new cinema("joker", 9.99F);
        cinema b=new cinema("batman", 9.80F);
        a.disp();
        b.disp();
    }
}
