package Easy.zero.twenty;

public class twentySix {
    public static void main(String[] args){
        System.out.println(removeDuplicates(new int[]{1,1,2}))  ;
    }
    public static int removeDuplicates(int[] nums) {
        int i = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i - 1]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
