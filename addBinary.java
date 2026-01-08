class Solution {
    public String addBinary(String a, String b) {
        StringBuilder s = new StringBuilder();
        int n = a.length() - 1;
        int m = b.length() - 1;
        int carry =  0;
        while( n >= 0 || m >= 0 || carry == 1){
            if(n >= 0) carry += a.charAt(n--) - '0';
            if(m >= 0) carry += b.charAt(m--) - '0';
            s.append(carry%2);
            carry /= 2;
        }
        return s.reverse().toString();
    }
}
