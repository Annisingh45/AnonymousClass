package com.bridglabz.anonymous;

public class PopCorn {
    void taste() {
        System.out.println("taste blend");
    }

    public static void main(String[] args) {

        PopCorn popCorn = new PopCorn();     // super class object
        popCorn.taste();

        //Anonymous class
        PopCorn saltyPopCorn = new PopCorn()  //Subclass object
        {
            @Override
            public void taste() {
                System.out.println("taste salty");
            }
        };
        saltyPopCorn.taste();


        PopCorn caramelPopCorn = new PopCorn() {
            @Override
            public void taste() {
                System.out.println("taste sweet");
            }
        };
        caramelPopCorn.taste();
    }

}
//Anonymous inner class extends class