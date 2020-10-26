package com.company.JavaCourse.day7;


public class ExceptionalExceptions {
    public static void main(String[] args) {
        //you need to handle checked exceptions
        //checked exceptions are the ones that extend exceptions
        //unchecked exceptions extend runtimeexception
        //you can handle unchecked exceptions to
        //put the code that might throw an exception in a try
        //catch the specific exception
        //define the protocol

        try {
            int x = 0;
            int result = 8 /x;
        }
        catch (ArithmeticException e){
            System.out.println("we skipped this because you cannot dividee by 0");
        }
        catch (RuntimeException e){
            System.out.println("oh no");
        }
        catch(Exception e){
            System.out.println("o no");
        }

        //create an array
        //access an element that's not in there
        //catch the arrayindexoutofboundsexception
        //print a message
        int[] arr = {1,2,3};
        try{
            arr[4] = 5;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("oh no index out of bounds");
        }

        int[] arrayInt = new int[4];
        arrayInt[0] = 8;
        arrayInt[1] = 15;
        arrayInt[2] = 4;
        arrayInt[3] = 68;

        try {
                System.out.println(arrayInt[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("What did you do Baby Boo?!?");
            }


       // throw new NullPointerException("oeps");


    }
}
