class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        s1=''
        n,ans=0,1
        for i in range(len(s)):
            #if(s[i] not in s1):
            
            s1+=s[i]
            for j in range(i+1,len(s)):
                if(s[j-1]!=s[j]):
                    if(s[j] not in s1):
                        s1+=s[j]
                        n=len(s1)
                    else:
                        s1=''
                        break
                else:
                    s1=''
                    break
            if(n>ans):
                ans=n
        if(len(s)==0):
            return 0
        else:
            return ans
                