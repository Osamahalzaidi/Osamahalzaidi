/**
 * Created by Ahmed on 2/23/2022.
 */
public interface Queue <E> {
    boolean isEmpty();
    int size();
    void enqueue (E element);
    E dequeue();
    E first ();
}
