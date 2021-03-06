/**
* https://leetcode.com/problems/find-all-duplicates-in-an-array/
* Runtime beats 69.91% of C++ submissions
* Memory Usage beats 90.00% of C++ submissions
*/
class Solution {
public:
    vector<int> findDuplicates(vector<int>& nums) {
        int size = nums.size();
        vector<int> dups;

        for(int i = 0; i < size;)
            if(nums[nums[i]-1] != nums[i])
                swap(nums[i], nums[nums[i]-1]);
            else i++;

        for(int i = 0;i < size;i++)
            if(nums[i]!=i+1) 
                dups.push_back(nums[i]);
                
        return dups;
    }
};