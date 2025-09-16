package com.calculator;

import com.addition.Addition;
import com.division.Division;
import com.multiplication.Multiplication;
import com.subtraction.Subtraction;

public class CalculatorController {
    public static int calculate(int a, int b){
        int result;
       result= Addition.sumOfNums(a,b);
        System.out.println("addition of two numbers are-" +result);
        result= Subtraction.subOfNums(a,b);
        System.out.println("subtraction of two numbers are-" +result);
        result=Multiplication.mulOfNums(a,b);
        System.out.println("Multiplication of two numbers are-" +result);
        result=Division.divOfNums(a,b);
        System.out.println("Division of two numbers are-" +result);
        return result;

    }
}
