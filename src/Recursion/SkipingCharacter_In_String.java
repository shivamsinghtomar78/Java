package Recursion;

public class SkipingCharacter_In_String {
    public static void skip(int i,String s,String ans){
        if(i==s.length()){
            System.out.print(ans);
            return;
        }
        if(s.charAt(i)!='i' && s.charAt(i)!='a') ans+=s.charAt(i);
        skip(i+1,s,ans);
    }
    public static void main(String[] args) {
        String s="shivam singh";
        skip(0,s,"");
    }
}
