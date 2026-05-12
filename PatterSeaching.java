class Solution {
     void constructlps(String pat,int[] lps){
         int n = pat.length();
         int l = 0;
         int i = 1;
         while(i<n){
            if(pat.charAt(i) == pat.charAt(l)){
                l++;
                lps[i] = l;
                i++;
            }else{
                if(l != 0) {
                    l = lps[l-1];
                }else{
                    lps[i] = 0;
                    i++;
                }
            }
         }
     }
    ArrayList<Integer> search(String pat, String txt) {
        int n = txt.length();
        int m = pat.length();
        int[] lps = new int[m];
        ArrayList<Integer> res = new ArrayList<>();
        constructlps(pat,lps);
        int i = 0;
        int j = 0;
        while(i < n){
            if(txt.charAt(i) == pat.charAt(j)){
                i++;j++;
                if(j==m){
                    res.add(i-j);
                    j = lps[j-1];
                }
            }else{
                if(j!=0){
                    j=lps[j-1];
                }else{
                    i++;
                }
            }
        }
        return res;
    }
}
