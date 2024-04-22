package Recursion;

public class functionCalls {
    public static void mango(){
        System.out.println("hii,I am in mango..");

    }
    public static void banana(){
        mango();
        System.out.println("hii,I am in banana..");

    }
    public static void apple(){
        banana();
        System.out.println("hii,I am in apple..");
        mango();

    }
    public static void main(String[] args) {
        System.out.println("hii,I am in main ");
        apple();
    }
}
