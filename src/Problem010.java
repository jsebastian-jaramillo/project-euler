/*
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * 
 * Find the sum of all the primes below two million.
 *
 */

/**
 *
 * @author jsebastian.jaramillo@udea.edu.co
 */
final class Problem010 {
 
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
        
        final int LIMIT = 2000000;
        int term = 2;
        double primeNumbersSum = term; // primer numero primo
        
        
        for (int i = 1; i > 0; i++) {
            term = 2*i+1; // generados de terminos impares
            if (term < LIMIT) {
                if (Problem010.isPrimeNumber(term))
                    primeNumbersSum += term; // suma
            }else {
                break;
            }
        }
        
        System.out.println(primeNumbersSum);
    }
}