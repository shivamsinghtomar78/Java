package array;

import java.util.ArrayList;

public class basicOfArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0, 10);
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);
        arr.add(6,70);
        arr.add(7,80);
        System.out.println(arr.size());
        for (int i = 0; i <arr.size(); i++) {
            System.out.print(arr.get(i)+" ");


        }
        System.out.println();

        arr.set(3,400); //modify
        System.out.println(arr);// simple method to print all element of array
        arr.add(45);// adding more element
        System.out.println();
        System.out.println(arr.size());

        for (int i = 0; i <arr.size(); i++) {
            System.out.print(arr.get(i)+" ");


        }
    }
}