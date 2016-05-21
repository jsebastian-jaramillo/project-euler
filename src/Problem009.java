/*
 * A Pythagorean triplet is a set of three natural numbers, a < b < c,
 * for which,
 *          a^2 + b^2 = c^2
 *
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 *
 */

/**
 *
 * @author jsebastian.jaramillo@udea.edu.co
 */
final class Problem009 {
    
    private static boolean restriction0(int a, int b, int c) {
        
        boolean flag = false;
        if (a < b && b < c)
            flag = true;
        return flag;
    }
    
    private static boolean restriction1(int a, int b, int c, int value) {
        
        boolean flag = false;
        if ((a + b + c) == value)
            flag = true;
        return flag;
    }
    
    private static boolean restriction2(int a, int b, int c) {
        
        boolean flag = false;
        if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))
            flag = true;
        return flag;
    }
    
    public static void main(String[] args) {
        
        final int VALUE = 1000;
        
        int c = 0;
        int b = 0;
        int a = 0;
  
        for (c = VALUE; c > b; c--) {
            for (b = c-1; b > a; b--) {
                for (a = b-1; a > 0; a--) {
                    
                    if (Problem009.restriction0(a, b, c)) {
                        if (Problem009.restriction1(a, b, c, VALUE)) {
                            if (Problem009.restriction2(a, b, c)) {
                                
                                System.out.println("a = " + a + ", b = " + b + ", c = " + c);
                                System.out.println("a*b*c = " + a*b*c);
                                return;
                            }
                        }
                    }
                    
                }
            }   
        }
    }
}
