package hashMaps_Sets;

import java.util.TreeMap;

public class basicOfTreeMap7 {
    public static void main(String[] args) {
        TreeMap<String ,Integer> map=new TreeMap<>();
        map.put("Raghav",76);
        map.put("Himanshu",83);
        map.put("Amritanshu",13);
        map.put("Ayushi",82);
        map.put("Prachi",88);
        map.put("Madhav",200);
        map.put("Harshit",88);
        for(String key:map.keySet()){// give answer in sorted manner of key
            System.out.println(key+" "+map.get(key));
        }
    }
}
