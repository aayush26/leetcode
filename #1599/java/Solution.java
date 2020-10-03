/**
* https://leetcode.com/problems/maximum-profit-of-operating-a-centennial-wheel/
* Your runtime beats 26.30 % of java submissions.
* Your memory usage beats 39.91 % of java submissions.
*/
class Solution {
    public int minOperationsMaxProfit(int[] customers, int boardingCost, int runningCost) {
        int totalCustomers = 0;
        for(int i=0;i<customers.length;i++) {
            totalCustomers = totalCustomers+customers[i];
        }    
        int curr = 0;
        int rem = 0;  
        int res = -1;
        int maxp = 0;
        int profit  = 0;
        while(rem>0 || curr<customers.length) {
            int cust = 0;
            int tc = 0;
            if(curr<customers.length) {
             cust = customers[curr];
            }
            tc = Math.min(rem+cust,4);
            rem = rem+cust-tc;
            profit  = profit + (tc*boardingCost)-runningCost;
            curr++;
           
            if(profit>maxp) {
                maxp = profit;
                res = curr;
            }
        }
        return res;
    }
}
