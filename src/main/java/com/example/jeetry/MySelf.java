package com.example.jeetry;

public class MySelf implements MyVehicle{

    public String MyName;
    public int MyAge;
    public String MyHobbies;
    public double MyHeight;
    public double MyWeight;

    public MySelf(String myName, int myAge, String myHobbies, double myHeight, double myWeight) {
        MyName = myName;
        MyAge = myAge;
        MyHobbies= myHobbies;
        MyHeight = myHeight;
        MyWeight = myWeight;
    }


    public double getMyHeight() {
        return MyHeight;
    }

    public void setMyHeight(double myHeight) {
        MyHeight = myHeight;
    }

    public double getMyWeight() {
        return MyWeight;
    }

    public void setMyWeight(double myWeight) {
        MyWeight = myWeight;
    }

    public String getMyName() {
        return MyName;
    }

    public void setMyName(String myName) {
        MyName = myName;
    }

    public int getMyAge() {
        return MyAge;
    }

    public void setMyAge(int myAge) {
        MyAge = myAge;
    }

    public String getMyHobbies() {
        return MyHobbies;
    }

    public void setMyHobbies(String myHobbies) {
        MyHobbies = myHobbies;
    }

    public void printInfo(){
        System.out.println("Name          :" + MyName + "\nAge           :" + MyAge + "\nHobbies       :" + MyHobbies +
                "\nHeight        :" + MyHeight+" cm" + "\nWeight        : " + MyWeight+" kg" +
                "\nVehicle Type  :" + MyVehicleType + "\nVehicle Brand :" + MyVehicleBrand + "\nVehicle ID    :" + MyVehicleId );

    }
}
