package hashMaps_Sets;

import java.util.*;

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
    class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static class pairs{
        Node node;
        int level;
        pairs(Node node,int level){
            this.node=node;
            this.level=level;
        }
    }
    public static void topView(Node root) {
        HashMap<Integer,Integer> map =new HashMap<>();
        Queue<pairs> q=new LinkedList<>();
        pairs r=new pairs(root,0);
        q.add(r);
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        while(q.size()>0){
            pairs temp=q.remove();
            Node n=temp.node;
            int lvl=temp.level;
            min=Math.min(min,lvl);
            max=Math.max(max,lvl);
            if(!map.containsKey(lvl)) map.put(lvl,n.data);
            if (n.left!=null) q.add(new pairs(n.left,lvl-1));
            if (n.right!=null) q.add(new pairs(n.right,lvl+1));
        }
        for(int i=min;i<max;i++) {
            System.out.print(map.get(i) + " ");
        }
    }
    public int countPalindromicSubsequence(String s) {
        HashMap<Character,Integer> firstMap=new HashMap<>();
        HashMap<Character,Integer> lastMap=new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            char ch=s.charAt(i);
            if (!firstMap.containsKey(ch)) firstMap.put(ch,i);
            lastMap.put(ch,i);
        }
        int count=0;
        for (char ch:firstMap.keySet()) {
            int firstIdx=firstMap.get(ch);
            int lastIdx=lastMap.get(ch);
            Set<Character> set=new HashSet<>();
            for (int i =firstIdx+1; i <=lastIdx-1 ; i++) {
                set.add(s.charAt(i));
            }
            count+=set.size();
        }
        return count;
    }
}
