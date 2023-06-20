/*class Solution {
public:
    vector<int> getAverages(vector<int>& nums, int k) {
        long sum=0;
        vector<int> ans;
        for(int i=0;i<nums.size();i++){
            if(i==0&&k==0){
                ans.push_back(nums[0]);
            }
            else if(i<k||i>2*k-1){
                ans.push_back(-1);
            }
            else{
            for(int j=i-k;j<i+k+1;j++){
                sum+=nums[j];
            }
            long an=sum/((2*k)+1);
            ans.push_back(floor(an));}
            sum=0;
        }
        return ans;
    }
};*/


class Solution {
public:
    std::vector<int> getAverages(std::vector<int>& nums, int k) {
        int n = nums.size();
        int windowSize = 2 * k + 1;

        long long windowSum = 0;
        std::vector<int> result(n, -1);

        if (n < windowSize) {
            return result;
        }

        for (int i = 0; i < n; ++i) {
            windowSum += nums[i];

            if (i - windowSize >= 0) {
                windowSum -= nums[i - windowSize];
            }

            if (i >= windowSize - 1) {
                result[i - k] = static_cast<int>(windowSum / windowSize);
            }
        }

        return result;
    }
};
/*class Solution {
public:
    vector<int> getAverages(vector<int>& nums, int k) {
        long sum=0;
        vector<int> ans;
        for(int i=0;i<nums.size();i++){
            if(i==0&&k==0){
                ans.push_back(nums[0]);
            }
            else if(i<k||i>2*k-1){
                ans.push_back(-1);
            }
            else{
            for(int j=i-k;j<i+k+1;j++){
                sum+=nums[j];
            }
            long an=sum/((2*k)+1);
            ans.push_back(floor(an));}
            sum=0;
        }
        return ans;
    }
};*/


class Solution {
public:
    std::vector<int> getAverages(std::vector<int>& nums, int k) {
        int n = nums.size();
        int windowSize = 2 * k + 1;

        long long windowSum = 0;
        std::vector<int> result(n, -1);

        if (n < windowSize) {
            return result;
        }

        for (int i = 0; i < n; ++i) {
            windowSum += nums[i];

            if (i - windowSize >= 0) {
                windowSum -= nums[i - windowSize];
            }

            if (i >= windowSize - 1) {
                result[i - k] = static_cast<int>(windowSum / windowSize);
            }
        }

        return result;
    }
};
