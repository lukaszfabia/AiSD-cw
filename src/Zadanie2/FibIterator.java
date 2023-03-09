package Zadanie2;

import java.util.Iterator;

public class FibIterator implements Iterator<Integer> {
    private final int n;
    private int ind=0;
    private int firstElement=0;
    private int secElement=1;
    public FibIterator(int n) {
        this.n=n;
    }


    @Override
    public boolean hasNext() {
        return ind<n;
    }

    @Override
    public Integer next() {
        int next=firstElement+secElement;
        firstElement=secElement;
        secElement=next;
        ind++;
        return firstElement;
    }
}
