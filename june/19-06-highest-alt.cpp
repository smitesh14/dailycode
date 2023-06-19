class Solution {
public:
    int largestAltitude(vector<int>& gain) {
        vector<int> alt;
        alt.push_back(0);
        int t=0;
        for(auto x:gain){
            t+=x;
            alt.push_back(t);
        }
        sort(alt.begin(),alt.end());
        int l=alt.size();
        return alt[l-1];
    }
};