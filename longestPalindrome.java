class Solution {
    public int longestPalindrome(String s) {
        int cnt = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch) % 2 == 1){
                cnt++;
            }else{
                cnt--;
            }
        }
        if(cnt > 1){
            return s.length() - cnt + 1;
        }
        return s.length();
    }
}
