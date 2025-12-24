package Quest.DataStructuresAndAlgorithms.Array1;

import java.util.ArrayList;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        List<Integer> counters = new ArrayList<>();
        int counter = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1)    counter++;
            else {
                counters.add(counter);
                counter=0;
            }
        }
        counters.add(counter);
        int ans = 0;
        for(Integer i : counters){
            if(i > ans){
                ans = i;
            }
        }

        return ans;
    }
}
