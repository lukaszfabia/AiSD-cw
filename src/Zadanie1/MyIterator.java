package Zadanie1;

import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {
    private final Iterator<T> iterator;
    private final int k;
    private int ind=0;

    public MyIterator(Iterator<T> iterator, int k) {
        this.iterator = iterator;
        this.k = k;
    }


    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public T next() {
        for (int i = 0; i < k-1; i++) {
            if (iterator.hasNext()){
                iterator.next();
                ind++;
            }
        }
        if (iterator.hasNext()){
            T item= iterator.next();
            ind++;
            return item;
        }
        else {
            throw new RuntimeException("BR");
        }
    }
}
