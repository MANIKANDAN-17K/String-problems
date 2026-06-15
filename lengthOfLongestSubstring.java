class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int[] hash = new int[256];
        Arrays.fill(hash,-1);
        int l = 0,r=0,maxl= 0;
        while(r<n){
            if(hash[s.charAt(r)] >= l){
                l = Math.max(hash[s.charAt(r)] + 1, l);
            }
            maxl = Math.max(maxl,r-l+1);
            hash[s.charAt(r)]= r;
            r++;
        }
        return maxl;
    }
}
