package SingleProblems.Easy.zero.fifty;

public class fiftyEight {
    public static void main(String[] args){
        System.out.println(lengthOfLastWord("a"));
    }
    public static int lengthOfLastWord(String s) {
        StringBuilder stringBuilder = new StringBuilder(s.trim());
        String temp = String.valueOf(stringBuilder.reverse());
        if(temp.indexOf(' ') == -1)
            return temp.length();
        return temp.indexOf(' ');
    }
}
