class Solution {
    public int removeElement(int[] nums, int val) {
        int size = nums.length;
        for(int i=0; i<size;){
            if(nums[i] == val){
                for(int j = i; j < size-1; j++){
                    nums[j]=nums[j+1];
                }
                size = size-1;
            }
            else{
                i++;
            }
        }
        for(int i=0; i<size; i++){
            System.out.print(nums[i]+ " ");
         }
         System.out.println();
        return size;
    }
    public static void main(String[] args){
        Solution test = new Solution();
        int nums[]={1,1,2,2,3};
        System.out.println(test.removeElement(nums,1));
    }
}