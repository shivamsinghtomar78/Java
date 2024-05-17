package oops_In_Java;

public class student {
    // creating a new data type
    String name;
    int rno;
    double perecent;
    String schoolName="RPVV";
    public student(){// default constructor

    }
    public student(String name,int rno,double percent){// constructor
        this.name=name;
        this.rno=rno;
        this.perecent=percent;
    }
    public int getRno(){// getter
        return rno;
    }
    public void setRno(int rno){//setter
        this.rno=rno;

    }
}
