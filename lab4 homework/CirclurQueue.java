/**
 * Created by Ahmed on 2/12/2022.
 */
public class CirclurQueue<E> implements Queue<E>{
    final static int CAPACITY = 100;
    E[] data;
    int fr=0;
    int sz=0;

    public CirclurQueue(int c) {
        data= (E[]) new Object[c];
    }
    public CirclurQueue() {
        this(CAPACITY);
    }

    @Override
    public boolean isEmpty() {
        return sz==0;    }

    @Override
    public int size() {
        return sz;
    }

    @Override
    public void enQueue(E element) {
        if (size()== data.length)
            throw new IllegalStateException("Queue is full");
        int x =(fr+sz)% data.length;
        data[x]=element;
        sz++;
    }

    @Override
    public E deQueue() {
        if (isEmpty())return null;
        E delete=data[fr];
        data[fr]=null;
        sz--;
        fr=(fr+1)% data.length;
        return delete;    }

    @Override
    public E front() {
        if (isEmpty()) return null;
        return data[fr];
    }

    @Override
    public void rotate() {
        enQueue(deQueue());
    }
}