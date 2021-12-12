package com.example.jeetry;

public class MyFav extends MySelf {

    public String MyFood;
    public String MyDrink;
    public String MyColour;
    public String MyBrand;

    public MyFav(String myName, int myAge, String myHobbies, double myHeight, double myWeight, String myFood, String myDrink, String myColour, String myBrand) {
        super(myName, myAge, myHobbies, myHeight, myWeight);
        MyFood = myFood;
        MyDrink = myDrink;
        MyColour = myColour;
        MyBrand = myBrand;
    }

    public String getMyFood() {
        return MyFood;
    }

    public void setMyFood(String myFood) {
        MyFood = myFood;
    }

    public String getMyDrink() {
        return MyDrink;
    }

    public void setMyDrink(String myDrink) {
        MyDrink = myDrink;
    }

    public String getMyColour() {
        return MyColour;
    }

    public void setMyColour(String myColour) {
        MyColour = myColour;
    }

    public String getMyBrand() {
        return MyBrand;
    }

    public void setMyBrand(String myBrand) {
        MyBrand = myBrand;
    }

    public void printInfo(){
        System.out.println("Name       :" + super.MyName + "\nAge        :" + super.MyAge + "\nHobbies    :" + super.MyHobbies +
                "\nFav Food   :" + MyFood + "\nFav Drink  :" + MyDrink + "\nFav Colour :" + MyColour + "\nFav Brand  :" + MyBrand );

    }
}



