class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
        String fst = strs[0];
        String last = strs[strs.length - 1];
        for(int i = 0;i< Math.min(fst.length(),last.length());i++){
            if(fst.charAt(i) != last.charAt(i)){
                return ans.toString();
            }
            ans.append(fst.charAt(i));
        }
        return ans.toString();
    }
}
