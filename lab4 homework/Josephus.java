/**
 * Created by Ahmed on 2/14/2022.
 */

public class Josephus<E>{

    public E circle( E person[], int k) {

        CirclurQueue<E> circleQueue = new CirclurQueue<E>();

        for (int i = 0; i <person.length ; i++) {
            circleQueue.enQueue(person[i]);
        }
            while (circleQueue.size() > 1) {
                for (int i = 1; i <=k-1; i++) {
                    circleQueue.rotate();
                }
                E element = circleQueue.deQueue();
                System.out.println("The player '" + element + "' is out");

            }
            return circleQueue.deQueue();
        }

    }