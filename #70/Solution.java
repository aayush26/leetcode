public class Solution {
        public int climbStairs(int n) {
            //Using Binet's solution for Fibonacci series
            // Time complexity  O(1)

            double rootFive = Math.sqrt(5);
            double phi = (1+rootFive)/2;
            double phiInverse = (1-rootFive)/2;
            double binet= (Math.pow(phi,n+1) -Math.pow(phiInverse,n+1))/rootFive;
            long fib = Math.round(binet);

            return  (int) fib;
        }

}
