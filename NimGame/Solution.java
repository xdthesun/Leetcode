public class Solution{
    public boolean canWinNim(int n){
        /**if(n == 1 || n == 2 || n == 3)
            return true;
        else if(n == 4)
            return false;
        else{
            // n=1348820612   出现 StatckOverflowError
            return canWinNim(n-1)||canWinNim(n-2)||canWinNim(n-3);
        }*/
        if(n % 4 == 0)
            return false;
        else{
            return true;
        }
    }
    public static void main(String[] args){
        Solution test = new Solution();
        System.out.println(test.canWinNim(1348820612));
    }
}