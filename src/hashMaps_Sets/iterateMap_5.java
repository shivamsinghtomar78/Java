package hashMaps_Sets;

import java.util.HashMap;

public class iterateMap_5 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Raghav",76);
        map.put("Himanshu",83);
        map.put("Amritanshu",13);
        map.put("Ayushi",82);
        map.put("Prachi",88);
        map.put("Madhav",200);
        map.put("Harshit",88);
        System.out.println(map);
        for(String key:map.keySet()){
            System.out.print(key+" ");
        }
        System.out.println();
        for(String key:map.keySet()){
            System.out.print(map.get(key)+" ");
        }
        System.out.println();
        for(String key:map.keySet()){
            int val=map.get(key);
            System.out.println(key+":"+val);
        }

        for(int val:map.values()){
            System.out.print(val+" ");
        }
        System.out.println();
        for(Object pair:map.entrySet()){
            System.out.println(pair);
        }

    }
}
