package kyu7;

/**
 * 7 kyu
 * <a href="https://www.codewars.com/kata/56269eb78ad2e4ced1000013">...</a>
 * Details:
 * You might know some pretty large perfect squares. But what about the NEXT one?
 * Complete the findNextSquare method that finds the next integral perfect square after the one passed as a parameter.
 * Recall that an integral perfect square is an integer n such that sqrt(n) is also an integer.
 * If the parameter is itself not a perfect square then -1 should be returned.
 * You may assume the parameter is non-negative.
 */

public class NumberFun {
    public static long findNextSquare(long sq) {
        if (Math.floor(Math.sqrt(sq)) - Math.sqrt(sq) == 0) {
            return (long) Math.pow(Math.sqrt(sq) + 1, 2);
        }
        return -1;
    }
}
