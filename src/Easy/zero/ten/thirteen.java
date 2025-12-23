package Easy.zero.ten;
import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanToInt = new HashMap<>();
        romanToInt.put('I', 1);
        romanToInt.put('V', 5);
        romanToInt.put('X', 10);
        romanToInt.put('L', 50);
        romanToInt.put('C', 100);
        romanToInt.put('D', 500);
        romanToInt.put('M', 1000);

        int number = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentNumber = romanToInt.get(s.charAt(i));
            if (i + 1 < s.length() && currentNumber < romanToInt.get(s.charAt(i + 1))) {
                number -= currentNumber;
            } else {
                number += currentNumber;
            }
        }
        return number;
    }
}
