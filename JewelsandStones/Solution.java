import java.util.*;

public class Solution{
	public int numJewelsInStones(String J, String S) {
        int result=0;
        for(int i=0; i<J.length();i++){
        	for(int j=0; j<S.length(); j++){
        		if(J.charAt(i) == S.charAt(j)){
        			result = result+1;
        		}
        	}
        }
        return result;
    }
    public static void main(String[] args){
    	Scanner sb = new Scanner(System.in);
    	System.out.print("please input Jewels:");
    	String jewels = sb.nextLine();
    	System.out.print("please input Stones:");
    	String stones = sb.nextLine();

    	Solution test = new Solution();
    	System.out.println(test.numJewelsInStones(jewels,stones));
    }
}