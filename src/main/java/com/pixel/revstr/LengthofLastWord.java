package com.pixel.revstr;

public class LengthofLastWord {
    public static void main(String[] args) {
        String str = "fly to the moon";
        System.out.println(lengthOfLastWord(str));
    }
    public static int lengthOfLastWord(String lastWord){
        String str = lastWord.trim();
        int count = 0;
        for (int i=str.length()-1;i>0;i--) {
            if (str.charAt(i) != ' ') {
                count ++;
            }else {
                break;
            }
        }
        return count;
    }
}
