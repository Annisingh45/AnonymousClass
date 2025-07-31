package com.bridglabz.lambda;

@FunctionalInterface
public interface Addition {
    void add(int a, int b);
}
class AdditionImpl
{
    public static void main(String[] args) {

        Addition addition= (int a,int b) -> System.out.println(a+b); //when method takes parameter
        addition.add(10,10);
    }
}
