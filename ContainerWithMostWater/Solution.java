public class Solution{
    /**
     * 盛最多水的容器
     */

    /**
     * 方法一、 两层for循环，寻找最大的面积，时间复杂度为O(n2)
     */
    public int maxArea1(int[] height) {
        int result = 0;
        for(int i = 0; i < height.length-1 ; i++){
            if(height[i] > 0){
                for(int j = i+1; j<height.length; j++){
                    if(height[j] > 0){
                        int high = height[i] <= height[j]?height[i]:height[j];
                        int tempArea = high * (j - i);
                        if(tempArea > result){
                            result = tempArea;
                        }
                    }
                }
            }
        }
        return result;
    }
    /**
     * 方法二、从两边开始向中间查找，遇到较小的high，则较小的一边挪动一个数
     */
    public int maxArea2(int[] height) {
        int result = 0;
        int left = 0;
        int right = height.length-1;
        while(left < right){
            int high = height[left] <= height[right]?height[left]:height[right];
            int tempArea = high * (right - left);
            if(tempArea > result){
                result = tempArea;
            }
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return result;
    }
    public static void main(String[] args){
        Solution test = new Solution();
        int[] height = {1,2,3,4};
        System.out.println(test.maxArea2(height));
    }
}