
/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 *
 */

/**
 *
 * @author jsebastian.jaramillo@udea.edu.co
 */
final class Problem003 {
    
    private static int primeFactor(long number, int lastPrimeFactor) {
        
        if (number != 1) {
            int i = 2;
            while (i <= number) {            

                if((number%i) == 0) {
                    // i es factor primo
                    return primeFactor(number/i, i);
                }
                i++;
            }
        }
        return lastPrimeFactor;
    }
    
    public static void main(String[] args) {
        
        final long NUMBER = 600851475143L;
        
        System.out.println("" + Problem003.primeFactor(NUMBER,0));
    }
}
