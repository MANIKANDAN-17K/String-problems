class Solution {
    public int minSwaps(String s) {
        int n = s.length();
        int l = 0,r=0;
        int ans = 0;
        for(int i = 0;i<n;i++){
            if(s.charAt(i) == '['){
                l++;
            }else{
                if(l == 0) r++;
                else l--;
            }
        }
        ans = (int)Math.ceil(l/2.0)+(int)Math.ceil(r/2.0);
        return (ans/2);
    }
}
