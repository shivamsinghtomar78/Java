package hashMaps_Sets;

import java.util.HashSet;

public class setIterate_2 {
    public static void main(String[] args) {

        int [] arr={4,9,2,6,4,8,1};
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        HashSet<Integer> set=new HashSet<>();
        set.add(20);
        set.add(100);
        set.add(10);
        set.add(-8);
        set.add(200);
        for(int ele:set){
            System.out.print(ele+" ");
        }
        System.out.println();
        set.add(500);

        System.out.println(set);
        set.add(500);// Hashset have only one occurence -ek element ek baar set mein add ho skt hai
        System.out.println(set);

    }
}
