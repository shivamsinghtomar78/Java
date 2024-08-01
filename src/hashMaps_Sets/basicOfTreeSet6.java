package hashMaps_Sets;

import java.util.TreeSet;

public class basicOfTreeSet6 {
    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<>();
        set.add(20);
        set.add(100);
        set.add(10);
        set.add(-8);
        set.add(200);
        for (int ele:set) {// in traversal of set it give sorted element
            System.out.print(ele+" ");

        }
    }
}
