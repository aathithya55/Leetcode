class Solution {
    public int compress(char[] chars) {
        int n = chars.length, res = 0, i = 0;
        while(i < n) {
            int len = 1;
            while(i+len < n && chars[i+len]==chars[i]) len++;
            chars[res++] = chars[i];
            if(len > 1) {
                for(char c : Integer.toString(len).toCharArray()) {
                    chars[res++] = c;
                }
            }
            i += len;
        } 
        return res;
    }
}