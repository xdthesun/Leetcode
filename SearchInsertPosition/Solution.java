public class Solution{
    public int searchInsert(int[] nums, int target){
        int result=0;
        if(nums[nums.length-1]<target){
            result = nums.length;
        }
        else{
            for (int i=0;i<nums.length;i++) {
                if(target <= nums[i]  && i<nums.length){
                    result = i;
                    break;
                }
            }
        }
        return result;
    }
    public static void main(String[] args){
        Solution test = new Solution();
        int nums[] = {1,3,5,6};
        int target = 0;
        System.out.println(test.searchInsert(nums, target));
    }
}