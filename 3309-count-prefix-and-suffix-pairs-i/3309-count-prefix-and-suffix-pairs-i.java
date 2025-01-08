class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(valid(words[i],words[j]))count++;
            }
        }
        return count;
    }
    public boolean valid(String str1,String str2){
        if(str1.length()>str2.length()){
            return false;
        }
        int len=str1.length();
        return str1.equals(str2.substring(0,len)) && str1.equals(str2.substring(str2.length()-len));
    }
}