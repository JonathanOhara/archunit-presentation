package edu.jonathan.archunit.util;

import edu.jonathan.archunit.service.PersonService;

public class SomeUtil {

    public static long sum(long firstNumber, long secondNumber){
        return firstNumber + secondNumber;
    }


    public static PersonService makeJewelFromNiobium(long firstNumber, long secondNumber){
        return new PersonService();
    }
}
