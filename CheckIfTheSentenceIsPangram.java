class Solution {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length()<26)
            return false;
        
        
        int a[]=new int[26];
        for(int i=0; i<sentence.length(); i++){
            int t=sentence.charAt(i);
            a[t%26]=1;
            
        }
        for (int i=0; i<26; i++){
            if (a[i]==0){
                return false;
            }
            
        }
        return true;
    }
}
