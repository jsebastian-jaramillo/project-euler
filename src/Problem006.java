/*
 * The sum of the squares of the first ten natural numbers is,
 *                  12 + 22 + ... + 102 = 385
 * 
 * The square of the sum of the first ten natural numbers is,
 *                  (1 + 2 + ... + 10)2 = 552 = 3025
 * 
 * Hence the difference between the sum of the squares of the first ten natural 
 * numbers and the square of the sum is 3025 − 385 = 2640.
 * 
 * Find the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum.
 *
 */

/**
 *
 * @author jsebastian.jaramillo@udea.edu.co
 */
final class Problem006 {

    private static int sumOfTheSquares(int limit) {
        
        int sumOfTheSquares = 0;
        for (int i = 1; i <= limit; i++) {
            sumOfTheSquares += i*i;
        }
        
        return sumOfTheSquares;
    }

    private static int squareOfTheSum(int limit) {
        
        int squareOfTheSum = 0;
        for (int i = 1; i <= limit; i++) {
            squareOfTheSum += i;
        }
        
        return squareOfTheSum*squareOfTheSum;
    }

    public static void main(String[] args) {

        final int LIMIT = 100;
        
        System.out.println("" + Math.abs(Problem006.sumOfTheSquares(LIMIT) 
                - Problem006.squareOfTheSum(LIMIT)));
    }
}
