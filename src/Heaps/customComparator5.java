package Heaps;

import java.util.Arrays;

class student implements Comparable<student>{
    int rno;
    double perc;
    String name;
    student(int rno,double perc,String name){
        this.rno=rno;
        this.perc=perc;
        this.name=name;
    }
    public int compareTo(student s){
        return this.rno-s.rno;
    }
}
public class customComparator5 {
    public static void  print(student[]arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i].name+" ");
            System.out.print(arr[i].rno+" ");
            System.out.println(arr[i].perc);
        }
    }
    public static void main(String[] args) {
        student[] s=new student[4];
        s[0]=new student(76,89,"Raghav");
        s[1]=new student(88,78,"Himanshu");
        s[2]=new student(13,95,"shivam");
        s[3]=new student(83,50,"amrit");
        print(s);
        Arrays.sort(s);
        System.out.println();
        print(s);

    }


}
