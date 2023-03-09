package Zadanie3;

import java.util.Iterator;

public class FirstIterator<T> implements Iterator<T> {
    private Iterator<T> base;

    public FirstIterator(Iterator<T> base) {
        this.base = base;
    }

    @Override
    public boolean hasNext() {
        return base.hasNext();
    }

    @Override
    public T next() {
        if (base.hasNext()){
            return base.next();
        }
        return null;
    }
}
