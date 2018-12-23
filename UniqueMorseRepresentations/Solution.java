import java.util.*;

public class Solution{
    public  int uniqueMorseRepresentations(String[] words) {
        Map<Character, String> baseLitter = new HashMap<Character, String>(){
            {   //初始化模块
                put('a', ".-");put('b', "-...");put('c', "-.-.");put('d', "-..");
                put('e', ".");put('f', "..-.");put('g', "--.");put('h', "....");
                put('i', "..");put('j', ".---");put('k', "-.-");put('l', ".-..");
                put('m', "--");put('n', "-.");put('o', "---");put('p', ".--.");
                put('q', "--.-");put('r',".-.");put('s', "...");put('t', "-");
                put('u', "..-");put('v', "...-");put('w', ".--");put('x', "-..-");
                put('y', "-.--");put('z', "--..");
            }
        };
        int result = 0;
        //遍历查看map中的值是否正确
        for(Character key : baseLitter.keySet()){
            System.out.println("key=" + key + "  value=" + baseLitter.get(key));
        }
        Set<String> memCode = new HashSet<String>();
        for(int i = 0; i < words.length; i++){
            String temp = new String(); 
            for(int j = 0; j<words[i].length(); j++){
                temp = temp + baseLitter.get(words[i].charAt(j));
            }
            System.out.println(temp);
            memCode.add(temp);
        }
        result = memCode.size();
        return result;
    }
    public static void main(String[] args){
        Solution test = new Solution();
        String[] testStr = new String[]{"gin", "zen", "gig", "msg"};
        System.out.println(test.uniqueMorseRepresentations(testStr));
    }

}