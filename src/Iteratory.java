import Zadanie1.MyIterator;
import Zadanie2.FibIterator;
import Zadanie4.PrimesIterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iteratory {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4,12,5,21,31);
        Iterator<Integer> myIterator= new MyIterator<>(num.iterator(), 4);
        Iterator<Integer> fib= new FibIterator(10);


        Iterator<Integer> primes = new PrimesIterator(20);
        while(primes.hasNext()){
            System.out.println(primes.next());
        }
    }


}