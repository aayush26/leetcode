/**
 * https://leetcode.com/problems/climbing-stairs/
 */
 
class Solution {
    public int climbStairs(int n) {
        return fib(n + 1);
    }
    
    public int fib(int n) 
    { 
       if (n <= 1) 
          return n; 
       return fib(n-1) + fib(n-2); 
    }   
}
