class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length() != words.length) return false;
        Map<Character,String> chWd = new HashMap<>();
        Map<String,Character> wdCh = new HashMap<>();
        for(int i = 0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            String word = words[i];
            if(chWd.containsKey(ch)){
                if(!chWd.get(ch).equals(word)){
                    return false;
                }
            }else if(wdCh.containsKey(word)){
                return false;
            }else{
                wdCh.put(word,ch);
                chWd.put(ch,word);
            }
        }
        return true;
    }
}
