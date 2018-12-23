public class Solution{
    public int getSum(int a, int b){
        if(b ==0 )
            return a;
        int c= a^b;
        int d= (a&b)<<1;
        return getSum(c, d);
    }
    public static void main(String[] args){
        Solution test = new Solution();
        System.out.println(test.getSum(10,12));
    }
}