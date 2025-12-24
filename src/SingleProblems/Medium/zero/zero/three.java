package SingleProblems.Medium.zero.zero;

import java.util.*;

public class three {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
    public static int lengthOfLongestSubstring(String s) {
        List<Integer> len = new LinkedList<>();
        HashSet<Character> lettersUsed = new HashSet<>();
        int ans = 0;
        int counter = 0;
        int start = 0;
        for(int i = 0; i < s.length(); i++){
            if(!lettersUsed.contains(s.charAt(i))){
                lettersUsed.add(s.charAt(i));
                counter++;
                start = i-counter;
            }
            else {
                len.add(counter);
                counter = 0;
                lettersUsed = new HashSet<>();
                i = start+1;
            }
        }
        len.add(counter);
        for(Integer i : len){
            if(i > ans){
                ans = i;
            }
        }
        return ans;
    }
}
