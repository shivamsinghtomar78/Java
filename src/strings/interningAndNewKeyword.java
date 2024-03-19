package strings;

public class interningAndNewKeyword {
    public static void main(String[] args) {
        String s="shivam ";

        //s.charAt(0)='l'; error because string is immutable
        //s.charAt(2)='u' error because string is immutable
         s = "tomar";
        System.out.println(s);
    }
}
