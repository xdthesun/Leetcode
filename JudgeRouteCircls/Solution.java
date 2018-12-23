public class Solution{
    public boolean judgeCircle(String moves) {
        int result=0;
        for(int i=0; i<moves.length(); i++){
            if(moves.charAt(i) == 'U'){
                result = result +1;
            }
            else if(moves.charAt(i) == 'D'){
                result = result -1;
            }
            else if(moves.charAt(i) == 'R'){
                result = result+1;
            }
            else if(moves.charAt(i) == 'L'){
                result = result-1;
            }
            else{
                System.out.println("please confirm string!");
            }
        }
        if(result == 0)
            return true;
        return false;
    }
    public static void main(String[] args){
        Solution test = new Solution();
        String inputStr = "U";
        System.out.println(test.judgeCircle(inputStr));
    }
}