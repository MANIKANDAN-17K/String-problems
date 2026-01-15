class Solution {
    public boolean canConstruct(String r, String m) {
        if(r.length() > m.length()) return false;
        int[] cnt = new int[26];
        for(char c : m.toCharArray()){
            cnt[c - 'a']++;
        }
        for(char c : r.toCharArray()){
            if(cnt[c - 'a'] == 0) return false;
            cnt[c-'a']--;
        }
        return true;
    }
}
