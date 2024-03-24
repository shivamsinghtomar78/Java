package stringBuilder;

public class append {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("abc");
        System.out.println(sb);
        sb.append("shivam");
        System.out.println(sb);
        sb.append(35);
        System.out.println(sb);
        sb.append("*");
        System.out.println(sb);
        sb.append("xyz");
        System.out.println(sb);
        char[]ch={'r','a','g'};
        sb.append(ch);
        System.out.println(sb);
       /* int []arr={1,2,3,4,5};
        sb.append(arr);//does not work ,address is appended
        System.out.println(sb);*/
        StringBuilder s=new StringBuilder("Tomar");
        sb.append(s);
        System.out.println(sb);


    }
}
