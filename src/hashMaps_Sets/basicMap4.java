package hashMaps_Sets;
import java.util.HashMap;
public class basicMap4 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Raghav",76);
        map.put("Himanshu",83);
        map.put("Amritanshu",13);
        map.put("Ayushi",82);
        map.put("Prachi",88);
        System.out.println(map);
        System.out.println(map.containsKey("Raghav"));
        System.out.println(map.containsKey("Shivam"));
        System.out.println(map.containsValue(83));
        System.out.println(map.containsValue(69));
        map.put("Raghav",100);
        System.out.println(map);
        map.put("Madhav",200);
        System.out.println(map);
        map.put("Harshit",88);
        System.out.println(map);
        System.out.println(map.size());
        map.remove("Raghav");
        System.out.println(map+" "+map.size());
        map.remove("Shivam");
        System.out.println(map+" "+map.size());
        System.out.println(map.get("Harshit"));


    }
}
