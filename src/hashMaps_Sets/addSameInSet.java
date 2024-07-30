package hashMaps_Sets;

import java.util.HashSet;

public class addSameInSet {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("Shivam");
        set.add("Shivam");
        set.add("Shivam");
        set.add("Shivam");
        set.add("Shivam");
        System.out.println(set);
        System.out.println(set.size());
        set.remove("Shivam");
        System.out.println(set);
        System.out.println(set.size());





    }
}
