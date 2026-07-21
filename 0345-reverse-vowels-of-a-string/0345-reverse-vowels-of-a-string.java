class Solution {
    public String reverseVowels(String s) {
        StringBuilder vowels=new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(isVowel(ch)){
                vowels.append(ch);
            }
        } 
        vowels.reverse();

        StringBuilder ans=new StringBuilder(s);
        int j=0;

        for(int i=0;i<ans.length();i++){
            if(isVowel(ans.charAt(i))){
                ans.setCharAt(i, vowels.charAt(j++));
            }
        }
        return ans.toString();
    }
    boolean isVowel(char ch){
        ch= Character.toLowerCase(ch);
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}