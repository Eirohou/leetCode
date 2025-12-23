package Medium;

import java.util.HashSet;
import java.util.Set;

public class three {
    public int lengthOfLongestSubstring(String s) {
        Set<String> usedLetters = new HashSet<>();
        int answer = 0;

        for(int i = 0; i < s.length(); i++){
            if(!usedLetters.contains(s.charAt(i) + "")){
                usedLetters.add(s.charAt(i) + "");
                answer++;
            }
        }

        return answer;
    }
}
