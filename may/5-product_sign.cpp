class Solution {
public:
    int arraySign(vector<int>& nums) {
        int n=0;
        for(auto x:nums){
            if (x<0)
            n++;
            else if(x==0)
            return 0;
        }
        if (n%2==0)
        return 1;
        else
        return -1;
    }
};