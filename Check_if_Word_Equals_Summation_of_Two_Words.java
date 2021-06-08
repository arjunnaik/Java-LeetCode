class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        Map<Character,Character> map=new HashMap<Character,Character>(){{put('a','0'); put('b','1'); put('c','2'); put('d','3'); put('e','4'); put('f','5'); put('g','6'); put('h','7'); put('i','8'); put('j','9');}};
        
        String s1="",s2="",s3="";
        for (int i=0; i<firstWord.length(); i++){
            s1=s1+map.get(firstWord.charAt(i));
        }
        for (int i=0; i<secondWord.length(); i++){
            s2=s2+map.get(secondWord.charAt(i));
        }
        for (int i=0; i<targetWord.length(); i++){
            s3=s3+map.get(targetWord.charAt(i));
        }
        int a,b,c;
        a=Integer.parseInt(s1);
        b=Integer.parseInt(s2);
        c=Integer.parseInt(s3);
        if (a+b==c){
            return true;
        }
        return false;
        
    }
}
