class Solution{
	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}
		else if (strs.length == 1) {
			return strs[0];
		}
		String temp = strs[0];
		for(int i = 1; i<strs.length; i++){
			if(strs[i] == "")
				return "";
			temp = twoCommonPrefix(temp, strs[i]);
			if (temp == "") {
				return "";
			}
		}
        return temp;
    }
    public String twoCommonPrefix(String firstStr, String secondStr){
    	if(firstStr == "" || secondStr == "")
    		return "";
    	//compete the length of two string
    	int length = firstStr.length()<secondStr.length() ? firstStr.length():secondStr.length();
    	for(int i=length; i>=0 ; i--){
    		if(firstStr.substring(0,i).equals(secondStr.substring(0,i))){
    			System.out.println(firstStr.substring(0,i));
    			return firstStr.substring(0,i);
    		}
    	}
    	return "";
    }
    public static void main(String srgs[]){
    	//TODoTEST
    	Solution twoString = new Solution();
    	String[] strs={"1234", "1234","12345","123456","12345678"};
    	System.out.println(twoString.longestCommonPrefix(strs));
    }

}