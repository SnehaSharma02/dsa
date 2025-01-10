class Solution {
    public String reverseVowels(String s) {
        char[]chars= s.toCharArray();
        Stack<Character>stack= new Stack<>();
        for(char c: chars){
            if(isVowel(c)){
                stack.push(c);
            }
        }
        for(int i=0;i<chars.length;i++){
            if(isVowel(chars[i])){
                chars[i]=stack.pop();
            }
        }
        return new String(chars);
    }
    private boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c)!=-1;
    }
}