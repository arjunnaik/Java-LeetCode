class Solution {
    public String interpret(String command) {

        int i=0,j=command.length()-1;
        String ans="";
        while(i<=j){
            if (command.charAt(i)=='G'){
                ans=ans+'G';
                i++;
            }else if(command.charAt(i)=='(' && command.charAt(i+1)=='a'){
                ans=ans+"al";
                i=i+4;
            }else{
                ans=ans+'o';
                i=i+2;
            }
        }
        return ans;
        
        
    }
}
