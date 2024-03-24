package stringBuilder;

public class stringBuilderInJava {
    public static void main(String[] args) {
     /*   String s="shivam";
        StringBuilder m= new StringBuilder("shivam singh");
        System.out.println(m);
        StringBuilder sb=new StringBuilder("");
        System.out.println(sb.length());
        */
        String s="abc";
        StringBuilder sb= new StringBuilder(s);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        StringBuilder x=new StringBuilder(10);// mentioned capacity
        System.out.println(x.capacity());
        StringBuilder p=new StringBuilder("");
        System.out.println(p.capacity());// by default capacity






    }
}
