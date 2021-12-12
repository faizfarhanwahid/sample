package com.example.jeetry;

public class MyStudent extends MySelf implements MyVehicle{

    public String MyMactricNo;
    public String MyProgramCode;
    public String MyCampus;

    public MyStudent(String myName, int myAge, String myHobbies,double myHeight, double myWeight, String myMactricNo, String myProgramCode, String mycampus) {
        super(myName, myAge, myHobbies, myHeight, myWeight);
        MyMactricNo = myMactricNo;
        MyProgramCode = myProgramCode;
        MyCampus = mycampus;
    }

    public String getMyMactricNo() {
        return MyMactricNo;
    }

    public void setMyMactricNo(String myMactricNo) {
        MyMactricNo = myMactricNo;
    }

    public String getMyProgramCode() {
        return MyProgramCode;
    }

    public void setMyProgramCode(String myProgramCode) {
        MyProgramCode = myProgramCode;
    }

    public String getMycampus() {
        return MyCampus;
    }

    public void setMycampus(String myCampus) {
        MyCampus = myCampus;
    }

    public void printInfo(){
        System.out.println("Name          :" + super.MyName + "\nAge           :" + super.MyAge + "\nHobbies       :" + super.MyHobbies +
                "\nMatric No     :" + MyMactricNo + "\nProgram Code  :" + MyProgramCode + "\nCampus        :" + MyCampus +
                "\nVehicle Type  :" + MyVehicleType + "\nVehicle Brand :" + MyVehicleBrand + "\nVehicle ID    :" + MyVehicleId );

    }
}

