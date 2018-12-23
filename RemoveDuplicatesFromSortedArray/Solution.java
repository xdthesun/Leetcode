class Solution {
    public int removeDuplicates(int[] nums) {
        int size = nums.length;
        for(int i=0; i<size-1;){
            if(nums[i] == nums[i+1]){
                for(int j = i+1; j < size-1; j++){
                    nums[j]=nums[j+1];
                }
                size = size-1;
            }
            else{
                i++;
            }
        }

        return size;
    }
    public static void main(String[] args){
        Solution test = new Solution();
        int nums[]={1,1,2};
        int result = test.removeDuplicates(nums);
        System.out.println(result);
        for(int i=0; i<result; i++){
            System.out.println(nums[i]);
        }
    }
}