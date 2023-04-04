public class movies {
    int no=21;
    String name="abc";
    void display(){System.out.println(no+" sahi movie "+name);}

    public static void main(String[] args){
        movies a=new movies();
        movies b=new movies();

        a.display();
        b.display();
    }
}
