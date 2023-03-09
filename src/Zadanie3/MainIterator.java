package Zadanie3;

import Zadanie3.FirstIterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MainIterator<T> implements Iterator<T> {
    private FirstIterator<T> firstIterator;
    private SecIterator<T> secIterator;
    private boolean isFirstIterator;

    public MainIterator(FirstIterator<T> firstIterator, SecIterator<T> secIterator) {
        this.firstIterator = firstIterator;
        this.secIterator=secIterator;
        this.isFirstIterator=false;
    }

    @Override
    public boolean hasNext() {
        return firstIterator.hasNext() || secIterator.hasNext();
    }

    @Override
    public T next() {
        if(!hasNext()){
            throw new NoSuchElementException("No more elements");
        }
        isFirstIterator=!isFirstIterator;
        Iterator<T> current= isFirstIterator ?  firstIterator : secIterator;

        if (!current.hasNext()){
            current=isFirstIterator ? secIterator:firstIterator;
        }
        return current.next();
    }
}
