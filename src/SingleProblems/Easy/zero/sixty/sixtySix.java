package SingleProblems.Easy.zero.sixty;

import java.math.BigInteger;
import java.util.Arrays;

public class sixtySix {
    public static void main(String[] args){
        System.out.println(Arrays.toString(plusOne(new int[]{7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6})));
    }
    public static int[] plusOne(int[] digits) {
        BigInteger temp = BigInteger.ZERO;
        BigInteger ten = BigInteger.valueOf(10);

        for (int i = 0; i < digits.length; i++) {
            BigInteger power = ten.pow(digits.length - i - 1);
            temp = temp.add(BigInteger.valueOf(digits[i]).multiply(power));
        }

        temp = temp.add(BigInteger.ONE);
        String tem = temp.toString();
        int[] ans = new int[tem.length()];
        for (int i = 0; i < tem.length(); i++) {
            ans[i] = Character.getNumericValue(tem.charAt(i));
        }
        return ans;

    }
}
