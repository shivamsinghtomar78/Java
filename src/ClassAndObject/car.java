package ClassAndObject;

public class car {
    static int noOfCarsSold;
    int noOfWheels;
    String colour;
    float maxSpeed;
    float currentFuelInLitres;
    int noOfSeats;
    car(String colour){
      this.colour=colour;
       noOfWheels=4;
       currentFuelInLitres=2;
       noOfSeats=5;
       maxSpeed=150;
    }
    car(){
        this("Black");
        currentFuelInLitres=5;
    }
    static {
       noOfCarsSold=0;
        System.out.println("I am in Static Block");
    }
    {
        noOfCarsSold++;
        System.out.println("I am in Init Block");
    }

    public car start(){
        if(currentFuelInLitres==0){
            System.out.println("car is out of fuel,can not start");
        } else if (currentFuelInLitres<5) {
            System.out.println("car is in reserved mode ,please refuel");
        }
        else{
            System.out.println("car is Started ....Bruhhhhhhhhhhhhhhhhhhh");
        }
        return this;
    }
    public void drive(){
        currentFuelInLitres--;
           System.out.println("car is driving");



    }
    public void addFuel(float currentFuelInLitres){
        this.currentFuelInLitres+=currentFuelInLitres;
    }
    public float getCurrentFuelInLitres(){
        return currentFuelInLitres;

    }

}
