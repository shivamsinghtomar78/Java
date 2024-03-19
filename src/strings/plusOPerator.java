package strings;

public class plusOPerator {
    public static void main(String[] args) {
        String s="abc";
        s=s+"def";
        System.out.println(s);
        String t="pqr";
        s=t+"suv";
        System.out.println(s);
        s=s+10;
        System.out.println(s);
        System.out.println("abc"+10+20);
        System.out.println(10+20+"abc");

    }
}
