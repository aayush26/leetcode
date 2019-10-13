class Solution {
public:
    bool isPalindrome(long long x) {
        long long n = 0, temp = 0, org = x;
        // cout<<x<<endl;
        if (x >= 0) {
            while(x != 0) {
                temp = x%10;
                n = n*10 + temp;
                x /= 10;
                // cout<<x<<" "<<n<<endl;   
            }
        } else {
            return false;
        }
        if (n==org) return true;
        else return false;
    }
};

