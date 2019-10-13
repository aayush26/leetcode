/**
 * https://leetcode.com/problems/climbing-stairs/
 * runtime beats 51.66% of cpp solutions
 * memory usage beats 97.06% of cpp solutions
**

class Solution {
public:
    int climbStairs(int n) {
        
        if(n==0 || n==1)
            return 1;
        
        int *a = new int[n+1];
        
        a[0] = 1;
        a[1] = 1;
        a[2] = 2;
        
        for(int i=3;i<=n;i++){
            a[i] = a[i-1]+a[i-2];
        }
        int ans = a[n];
        delete []a;
        return ans;
        
    }
};
