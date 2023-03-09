package Zadanie4;

import java.util.Iterator;

public class PrimesIterator implements Iterator<Integer> {
    private int ind;
    private final int n;

    public PrimesIterator(int n) {
        this.ind=2;
        this.n=n;
    }

    @Override
    public boolean hasNext() {
        while (ind<=n){
            if(checking(ind)){
                return true;
            }
            ind++;
        }
        return false;
    }

    @Override
    public Integer next() {
        while (hasNext()){
            int number = ind;
            ind++;
            if (checking(number)){
                return number;
            }
        }
        return null;
    }

    public boolean checking(int n){
        if (n<=2){
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
