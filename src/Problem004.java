/*
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 */

/**
 *
 * @author jsebastian.jaramillo@udea.edu.co
 */
final class Problem004 {
   
    private static boolean isPalindrome(int iNumber) {
    
        boolean flag = true;
        String sNumber = String.valueOf(iNumber);
        
        for (int i=0, j=sNumber.length()-1; i<j; i++, j--) {
            if (sNumber.charAt(i) != sNumber.charAt(j)) {
                flag = false;
                break;
            }
        }
        
        return flag;
    }
    
    public static void main(String[] args) {
        
        int num0 = 999;
        int num1 = 999;

        while (num0 > 100) {
            while (num1 > 900) {

                if (Problem004.isPalindrome(num0*num1)) {
                    System.out.println(num0 + "x" + num1 + " = " + num0*num1);
                    return;
                }else {
                    num1--;
                }
            }
            num0--;
            num1 = num0;
        }
    }
}
