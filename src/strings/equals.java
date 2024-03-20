package strings;

public class equals {
    public static void main(String[] args) {
        String s="abcxyz";
        String t="abc";
        t+="xyz";
        System.out.println(s==t);
        System.out.println(s.equals(t));//we only use equals in string 


    }
}
