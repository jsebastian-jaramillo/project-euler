
import java.util.HashSet;
import java.util.Set;

/*
 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 */

/**
 *
 * @author jsebastian.jaramillo@udea.edu.co
 */
public class Problem001 {
    
    public static void main(String[] args) {
        
        final int MIN = 3;
        final int MAX = 5;
        final int LIMIT = 1000;
        
        int i = 1;
        int aux = 0;
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        
        while ((aux=i*MAX) < LIMIT) {
            set.add(aux);
            set.add(i*MIN);
            i++;
        }
        
        while ((aux=i*MIN) < LIMIT) {
            set.add(aux);
            i++;
        }
        
        for (Integer multiple : set) {
            sum += multiple;
        }
        
        System.out.println("" + sum);
    }
}
