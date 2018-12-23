import java.util.*;

import javax.swing.plaf.synth.SynthEditorPaneUI;

import com.sun.java_cup.internal.runtime.Symbol;
public class Solution{
    /**
     * 有效的括号
    */
    //方法一.使用数组来模拟栈的操作，后进先出
    public boolean isValid1(String s) {
        char[] temp = new char[10000];  //定义10000大小的数组才通过测试
        int j = 0;
        for(int i= 0; i<s.length() ; i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                temp[j] = s.charAt(i);
                j++;
            }
            else{
                if(j == 0){
                    return false;
                }
                else if(s.charAt(i) == ')'){
                    if(temp[j-1] != '('){ 
                        return false;
                    }
                    j--;
                }
                else if(s.charAt(i) == '}'){
                    if(temp[j-1] != '{'){ 
                        return false;
                    }
                    j--;
                }
                else if(s.charAt(i) == ']'){
                    if(temp[j-1] != '['){ 
                        return false;
                    }
                    j--;
                }
            }
        }
        if(j == 0)
            return true;
        else
            return false;
    }

    //方法二.使用Java栈集合来进行操作
    public boolean isValid2(String s) {
        Stack<Character> stack = new Stack<Character>();
        if(s.isEmpty()){
            return true;
        }
        for(int i = 0; i<s.length() ; i++){
            //遇到’(‘ '[' '{' 则入栈
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')'){
                if(stack.isEmpty() || stack.peek() != '('){
                   return false;
                }
                stack.pop();
            }
            else if(s.charAt(i) == ']'){
                if(stack.isEmpty() || stack.peek() != '['){
                    return false;
                }
                stack.pop();
            }
            else if(s.charAt(i) == '}'){
                if(stack.isEmpty() || stack.peek() != '{'){
                    return false;
                }
                stack.pop();
            }

        }
        if(stack.isEmpty() == true){
            return true;
        }
        else{
            return false;
        }
    }    
    public static void main(String[] args){
        Solution test = new Solution();
        System.out.println(test.isValid2("){"));
    }
}