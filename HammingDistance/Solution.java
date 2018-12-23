/**
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。给出两个整数 x 和 y，计算它们之间的汉明距离
 */


public class Solution{
    /**
     * 方法1  暴力求解
     */
    public int hammingDistance1(int x, int y){
        int result = 0;
        int tempX = x;
        int tempY = y;
        while(tempX != 0 || tempY != 0){
            if(tempX == (tempX>>1)<<1){
                if(tempY != (tempY>>1)<<1){
                    result++;
                }
            }
            else{
                if(tempY == (tempY>>1)<<1){
                    result++;
                }
            }
            tempX = tempX>>1;
            tempY = tempY>>1;
        }
        return result;
    }
    /**
     * 方法2  二进制运算
     */
    public int hammingDistance2(int x, int y){
        int result = 0;
        int temp = x ^ y;
        System.out.println(temp);
        while(temp != 0){
            temp = temp&(temp-1);
            result++;
        }
        return result;
    }
    public static void main(String[] args){
        Solution test = new Solution();
        System.out.println("方法1:" + test.hammingDistance1(4, 10));
        System.out.println("方法2:" + test.hammingDistance2(4, 10));        
    }
}