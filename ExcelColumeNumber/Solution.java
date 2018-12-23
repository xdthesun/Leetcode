import java.util.*;
/**
 * 求excel的表列序号
 */
public class Solution{
    public int titleToNumber(String s){
        int result = 0;
        Map<Character , Integer> baseNum = new HashMap<Character, Integer>();
        for(int i=0; i<26;i++){
            Character temp=new Character((char)('A'+i));
            baseNum.put(temp,i+1);
        }
        /*for(int i=0; i<26;i++){
            Character temp = new Character((char)('A'+i));
            System.out.println(temp + ": " + baseNum.get(temp));
        }*/
        for (int i = 0; i < s.length(); i++) {
            result = result * 26 + baseNum.get(s.charAt(i));
        }
        return result;
    }
    public static void main(String[] args){
        Solution test =new Solution();
        String s="AB";
        System.out.println(test.titleToNumber(s));
    }
}