/**
 * Created by Ahmed on 2/14/2022.
 */
public class Main {
    public static void main(String[] args) {

        String[] a1={"Khalid" , "Mohammed" , "Mahdi" ,"Ahmed" , "Ali" };

        Josephus<String> j =new Josephus<>() ;

        String winner =j.circle(a1 ,3 );

        System.out.println("---------------------------------------------");
        System.out.println("The winner is '"  +winner + "'");
        System.out.println("---------------------------------------------");

    }
}