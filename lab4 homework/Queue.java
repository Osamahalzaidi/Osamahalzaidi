/**
 * Created by Ahmed on 2/12/2022.
 */
public interface Queue<E> {
    boolean isEmpty();
    int size();
    void enQueue (E element);
    E deQueue();
    E front ();
    void rotate();
}
