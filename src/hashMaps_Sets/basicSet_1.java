package hashMaps_Sets;

import java.util.HashSet;

public class basicSet_1 {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        // insert:Tc=O(1);
        set.add(20);
        set.add(100);
        set.add(10);
        System.out.println(set.size());
        set.add(-8);
        set.add(200);
        System.out.println(set);
        set.remove(-8);
        System.out.println(set);
        System.out.println(set.size());
      // Search-True/false:Tc:O(1)
        System.out.println(set.contains(100));
        Object[] arr=set.toArray();
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.print(arr[i]+" ");
//
//        }
        for (int ele:set){
            System.out.print(ele+" ");
        }

    }
}
