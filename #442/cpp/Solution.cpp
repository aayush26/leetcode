/*
  https://leetcode.com/problems/find-all-duplicates-in-an-array/
  runtime beats 24.21% of cpp submissions
  memeory usage beats  65.00% of cpp submissions
*/

class Solution {
public:
    vector<int> findDuplicates(vector<int>& a) {
        vector<int> v; 
        if(a.size()<=1)
            return v;
        
        sort(a.begin(), a.end());
        
        for(int i=1;i<a.size();i++)
        {
            if(a[i]==a[i-1])
            {
                v.push_back(a[i]);
                while(i!=a.size()-1 && a[i] == a[i+1])
                    i++;
                
            }
        }
        return v;
        
    }
};
