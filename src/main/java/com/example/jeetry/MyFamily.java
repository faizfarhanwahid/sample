package com.example.jeetry;

public class MyFamily extends MySelf implements MyVehicle{

    public String MyDad;
    public String MyMom;
    public String MySiblings;
    public String MySiblings1;

    public MyFamily(String myName, int myAge, String myHobbies,double myHeight, double myWeight, String myDad, String myMom, String mySiblings, String mySiblings1) {
        super(myName, myAge, myHobbies,myHeight, myWeight);
        MyDad = myDad;
        MyMom = myMom;
        MySiblings = mySiblings;
        MySiblings1 = mySiblings1;
    }

    public String getMyDad() {
        return MyDad;
    }

    public void setMyDad(String myDad) {
        MyDad = myDad;
    }

    public String getMyMom() {
        return MyMom;
    }

    public void setMyMom(String myMom) {
        MyMom = myMom;
    }

    public String getMySiblings() {
        return MySiblings;
    }

    public String getMySiblings1() { return MySiblings1; }

    public void setMySiblings(String mySiblings) {
        MySiblings = mySiblings;
    }

    public void setMySiblings1(String mySiblings1) { MySiblings1 = mySiblings1; }

    public void printInfo(){
        System.out.println("Name          :" + super.MyName + "\nAge           :" + super.MyAge + "\nHobbies       :" + super.MyHobbies +
                "\nFather's Name :" + MyDad + " Mother's Name :" + MyMom + "\n2nd Sibling   :" + MySiblings + "\n3rd Siblings  :" + MySiblings1 +
                "\nVehicle Type  :" + MyVehicleType + "\nVehicle Brand :" + MyVehicleBrand + "\nVehicle ID    :" + MyVehicleId );

    }
}
