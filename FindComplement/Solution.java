public class Solution{
    public int findComplement(int num){
        if(num == 0)
            return 1;
        int result=0;
        //System.out.println((long)Math.pow(2, this.countBit(num)));
        //规避掉当整数对应二进制为31位时，因为首位符号问题，导致计算不准
        //result = (int)((long)Math.pow(2, this.countBit(num)) -1- num);
        if(this.countBit(num) == 31)
            result =(int)Math.pow(2, this.countBit(num)) - num;
        else
            result = (int)Math.pow(2, this.countBit(num)) -1- num;
        return result;
    }
    public int countBit(int num){
        if(num == 0)
            return 0;
        int count =0;
        for(;num > 0;){
            num = num>>1;
            count++;
        }
        return count;
    }

    public static void main(String[] args){
        Solution test = new Solution();
        System.out.println(test.countBit(2147483647));
        System.out.println(test.findComplement(2147483646));
    }
}