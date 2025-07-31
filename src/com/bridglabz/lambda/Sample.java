package com.bridglabz.lambda;

@FunctionalInterface
public interface Sample {
    void display();

}

class SampleImpl
{
    public static void main(String[] args) {
        Sample sample=() -> System.out.println("I am learning java8 ");  //when method have no return type
        sample.display();
    }


}
