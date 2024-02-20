package array;

import java.util.ArrayList;

public class arraylistsadd {
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>();
        System.out.println(arr);
        arr.add(50);
        System.out.println(arr+" "+arr.size());
        arr.add(25);
        System.out.println(arr+" "+arr.size());
        arr.remove(1);
        System.out.println(arr+" "+arr.size());

    }
}
