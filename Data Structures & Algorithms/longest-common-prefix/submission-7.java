class Solution {
    public String longestCommonPrefix(String[] strs) {
        String output = "";
        int index = 0;
        boolean allMatch = true;;
        int size = strs[0].length();
        for(int i = 0; i < strs.length; i++){
            if(strs[i].length() < size){
                size = strs[i].length();
                index = i;
            }
        }
        char[] word = strs[index].toCharArray();
        for(int i = 0; i < strs[index].length(); i++){
            
            for(int x = 0; x < strs.length; x++){
                if(word[i] == (strs[x].charAt(i)))
                    allMatch = true;
                else{
                    allMatch = false;
                    return output;
                }
                    
            }

            if(allMatch == true)
                    output += word[i];
            else
                return output;
        }
        return output;
    }
}