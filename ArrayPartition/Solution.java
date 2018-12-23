import java.util.*;
/**
 * 拆分数组
 * 给定长度为 2n 的数组, 你的任务是将这些数分成 n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从1 到 n 的 min(ai, bi) 总和最大。+
 */
public class Solution{

    //使用sort方法的排序算法，先对数组进行排序-----leetcode提示超时
    public int arrayPairSum1(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for(int i=0; i < nums.length; i=i+2){
            result = result + nums[i];
        }
        return result;
    }

    public int arrayPairSum2(int[] nums){
        int result = 0;
        //冒泡排序
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length ; j++){
                if(nums[i]>nums[j]){
                    //交换顺序
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for(int i = 0; i < nums.length ;i = i+2){
            result += nums[i];
        }
        return result;
    }

    public static void main(String[] args){
        Solution test = new Solution();
        int[] nums = {1,3,4,2,3,3};
        System.out.println(test.arrayPairSum1(nums));
        System.out.println(test.arrayPairSum2(nums));
    }
}