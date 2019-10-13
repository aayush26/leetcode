/**
 * https://leetcode.com/problems/climbing-stairs/
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Climbing Stairs.
 * Memory Usage: 33.1 MB, less than 5.26% of Java online submissions for Climbing Stairs.
 */

public class Solution {
        public int climbStairs(int n) {

            double rootFive = Math.sqrt(5);
            double phi = (1+rootFive)/2;
            double phiInverse = (1-rootFive)/2;
            double binet= (Math.pow(phi,n+1) -Math.pow(phiInverse,n+1))/rootFive;
            long fib = Math.round(binet);

            return  (int) fib;
        }

}
