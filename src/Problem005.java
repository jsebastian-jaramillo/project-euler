/*
 * 2520 is the smallest number that can be divided by each of the numbers
 * from 1 to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of
 * the numbers from 1 to 20?
 *
 */

/**
 *
 * @author jsebastian.jaramillo@udea.edu.co
 */
final class Problem005 {
    
    private static boolean divisor(int number) {
    
        boolean flag = true;
        for (int i=1; i<=20; i++) {
            if (number % i != 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
    
    public static void main(String[] args) {
        
        int iNumber = 2520;
        
        while (true) {            
            if (Problem005.divisor(iNumber)) {
                System.out.println("" + iNumber);
                break;
            }else{
                iNumber++;
            }
        }
    }
}
