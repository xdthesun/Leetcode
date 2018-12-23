public class Solution{
    public String reverseWords(String s){
        String[] temp = s.split(" ");
        String result = new String(" ");
        for (String var : temp) {
            if(result.equals(" ")){
                result = this.reverseOneWords(var);
            }
            else{
                result = result + " " + this.reverseOneWords(var);
            }            
        }
        return result;
    }
    
    public String reverseOneWords(String str){
        str = new StringBuffer(str).reverse().toString();
        return str;
    }
    public static void main(String[] args){
        String str="hell0 123456 7890";
        Solution test = new Solution();
        System.out.println(test.reverseWords(str));
    }
}