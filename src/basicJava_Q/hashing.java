package basicJava_Q;

import java.util.*;
import java.util.Map;

public class hashing {
    public static void main(String[] args) {
       //country(key),population(value)
        HashMap<String,Integer>map=new HashMap<>();
        //insertion
        map.put("india",120);
        map.put("usa",30);
        map.put("china",150);
        System.out.println(map);
        map.put("china",180);
        System.out.println(map);
        //search
        if(map.containsKey("china")){
            System.out.println("key is present in the map");

        }else{

            System.out.println("key is not present in the map ");
        }
        System.out.println(map.get("china"));
        System.out.println(map.get("indonesia"));
        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.print(e.getKey()+" :");
            System.out.println(e.getValue());

        }
        Set<String> keys=map.keySet();
        for (String key:keys) {
            System.out.println(key+" "+map.get(key));

        }
        map.remove("china");
        System.out.println(map);
    }
}
