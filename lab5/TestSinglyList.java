import java.util.Scanner;

/**
 * Created by Ahmed on 2/16/2022.
 */
public class TestSinglyList {
    public static void main(String[] args) {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        Scanner in = new Scanner(System.in);
        int choice=-1;
        System.out.println("1 add fist \t 2add last \n 3 remove first\t4 remove all\t 0 exit");
        while (choice!=0)
        {
            System.out.println("Your choice: ");
            choice= in.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("input name");
                    list.addFirst(in.next());
                    break;
                case 2:
                    System.out.println("input name");
                    list.addLast(in.next());
                    break;
                case 3:
                    System.out.println("removed: " + list.removeFirst());
                    break;
                case 4:
                    while (!list.isEmpty())
                        System.out.println(list.removeFirst()+"\t");
                case 0:
                    System.exit(0);
            }
            System.out.println("\n first=" +list.first() + "\tlast" + list.last()+ "\tsize" + list.size());

        }
    }
}
