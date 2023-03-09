package Zadanie3;

import java.util.Iterator;

public class SecIterator<T>  implements Iterator<T> {
    private Iterator<T> base;

    public SecIterator(Iterator<T> base) {
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
