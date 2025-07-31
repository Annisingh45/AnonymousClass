package com.bridglabz.lambda;

@FunctionalInterface
public interface FindLength {
    int getSize(String s);
}
class FindLengthImpl
{
    public static void main(String[] args) {
        FindLength findLength=s -> s.length();
        System.out.println(findLength.getSize("Anni Singh"));
    }
}

