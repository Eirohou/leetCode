package Easy.zero.thirty;

public class thirtyFive {
    public static void main(String[] args){
        System.out.println(searchInsert(new int[]{-1,3,5,6}, 0))  ;
    }
    public static int searchInsert(int[] nums, int target) {
        if(target < nums[0]) return 0;
        if(target > nums[nums.length-1]) return nums.length;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target)
                return i;
        }
        for(int i = 1; i <= nums.length; i++){
            if(nums.length == 1) break;
            if(nums[i-1] == target-1){
                return i;
            }
        }
        for(int i = 0; i <= nums.length; i++){
            if(nums.length == 1) break;
            for(int j = nums[i]; j < nums[i+1]; j++){
                if(j > nums.length)
                    return j;
                if(j == target)
                    return i+1;
            }
        }
        return 0;
    }
}
