/*
 * https://leetcode.com/problems/gas-station/
 *Runtime: 0 ms, faster than 100.00% of Java online submissions for Gas Station.
 *Memory Usage: 37.5 MB, less than 98.04% of Java online submissions for Gas Station.
*/

class Solution
{
    int gas[];
    int cost[];
    
    public int canCompleteCircuit(int gas[], int cost[]) {
	int sumRemaining = 0; // track current remaining
	int total = 0; // track total remaining
	int start = 0; //starting
 
	for (int i = 0; i < gas.length; i++) {
		int remaining = gas[i] - cost[i];
 
		//if sum remaining of (i-1) >= 0, continue 
		if (sumRemaining >= 0) { 
			sumRemaining += remaining;
		//otherwise, reset start index to be current
		} else {
			sumRemaining = remaining;
			start = i;
		}
		total += remaining;
	}
 
	if (total >= 0){
		return start;
	}else{
		return -1;
	}
}
}
