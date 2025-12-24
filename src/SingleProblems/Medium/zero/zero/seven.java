package SingleProblems.Medium.zero.zero;

import java.math.BigInteger;

public class seven {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
    public static int reverse(int x) {
        String s = "";
        StringBuilder stringBuilder = new StringBuilder(x +"");
        boolean hadAMinus = false;
        if(stringBuilder.charAt(0) == '-') {
            s = String.valueOf(stringBuilder.reverse().deleteCharAt(stringBuilder.length()-1));
            s = '-' + s;
            hadAMinus = true;
        }
        else{
            s = String.valueOf(stringBuilder.reverse());
        }
        if(hadAMinus && s.charAt(0) != '-'){
            return 0;
        }
        if(!hadAMinus && s.charAt(0) == '-'){
            return 0;
        }
        try {
            return Integer.parseInt(s);

        }
        catch (Exception e){
            return 0;
        }
    }
}
