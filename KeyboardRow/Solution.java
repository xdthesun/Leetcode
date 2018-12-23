public class Solution{
    public String[] findWords(String[] words) {
        String[] keyBoard = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
        String[] tempStr = new String[10];
        for(int i=0,j=0; i<words.length; i++){
            if(this.compare2Str(words[i].toUpperCase(),keyBoard[0].toUpperCase())
            || this.compare2Str(words[i].toUpperCase(),keyBoard[1].toUpperCase())
            || this.compare2Str(words[i].toUpperCase(),keyBoard[2].toUpperCase())){
                tempStr[j] = words[i];
                //System.out.println(words[i]);
                j++;
            }
        }
        int sizeofStr =0;
        int i=0;
        while(tempStr[i]!=null){
            sizeofStr++;
            i++;
        }
        String[] resultStr = new String[sizeofStr];
        for(int j=0; j<sizeofStr; j++){
            resultStr[j] = tempStr[j];
        }
        return resultStr;
    }
    public boolean compare2Str(String str1, String str2){
        for(int i=0; i<str1.length(); i++){
            int flag=0;
            for(int j=0; j<str2.length(); j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                return false;
            }
        }
        return true;

    }
    public static void  main(String[] args){
        Solution test = new Solution();
        String[] str1 = {"Hello", "Alaska", "Dad", "Peace"} ;
        String[] result = test.findWords(str1);
        for(int i=0;i<result.length; i++){
            System.out.println(result[i]);
        }
    }
}