public class Solution{
    public String reverseString(String s){
        return (new StringBuffer(s).reverse().toString());
    }
    public static void  main(String[] args){
        Solution test = new Solution();
        System.out.println(test.reverseString("hello!"));
    }
}