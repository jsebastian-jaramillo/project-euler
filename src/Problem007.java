/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
 * that the 6th prime is 13.
 * 
 * What is the 10 001st prime number?
 * 
 */

/**
 *
 * @author ju4n
 */
final class Problem007 {
    
    private static boolean isPrimeNumber(int number) {
    
        boolean flag = true;
        for (int i = 2; i < number; i++) {
            if (number%i == 0) {
                flag = false;
                break;
            }
        }
        
        return flag;
    }
    
    public static void main(String[] args) {
        
        int limit = 10001;
        int next = 0;
        int i = 1;
        
        // el # 2 es el primer numero primo y unico numero primo par
        limit--;
        while (limit > 0) {
            // generamos el siguiente numero impar
            next = 2 * i + 1;
            if (Problem007.isPrimeNumber(next))
                limit--;
            i++;
        }
        System.out.println("" + next);
    }
}
