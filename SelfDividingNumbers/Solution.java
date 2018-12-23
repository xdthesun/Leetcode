import java.util.*;

public class Solution{
    public List<Integer> selfDividingNumbers(int left, int right){
        List<Integer> list = new ArrayList<Integer>();
        for(int i=left; i< right+1; i++){
            if(this.judgeDividingNumbers(i))
                list.add(i);
        }
        return list;
    }
    public boolean judgeDividingNumbers(Integer num){
        Integer temp = num;
        if(num == 0)
            return false;
        while(temp != 0){
            Integer tempNum= temp%10;
            if(tempNum == 0 || num%tempNum != 0){
                return false;
            }
            temp = temp / 10;
        }
        return true;
    }

    public static void main(String[] args){
        Solution test = new Solution();
        Integer num = new Integer(10);
        System.out.println(test.judgeDividingNumbers(num));
        System.out.println(test.selfDividingNumbers(1,22));
    }
}