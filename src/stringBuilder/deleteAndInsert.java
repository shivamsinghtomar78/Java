package stringBuilder;

public class deleteAndInsert {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("shivam");
        System.out.println(sb);
        sb.deleteCharAt(2);// delete a character from given index
        System.out.println(sb);
        sb.append("singh");// added item at last
        System.out.println(sb);
        sb.delete(0,5);// delete string from given point to point
        System.out.println(sb);
        sb.insert(2,'g');
        System.out.println(sb);
        sb.insert(6,69);
        System.out.println(sb);



    }
}
