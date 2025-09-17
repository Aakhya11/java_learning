package com.calculator;

import com.addition.Addition;
import com.division.Division;
import com.multiplication.Multiplication;
import com.subtraction.Subtraction;

public class CalculatorController {
    public static int calculate(int num1, int num2){
        int result;
       result= Addition.sumOfNums(num1,num2);
        System.out.println("addition of two numbers are-" +result);
        result= Subtraction.subOfNums(num1,num2);
        System.out.println("subtraction of two numbers are-" +result);
        result=Multiplication.mulOfNums(num1,num2);
        System.out.println("Multiplication of two numbers are-" +result);
        result=Division.divOfNums(num1,num2);
        System.out.println("Division of two numbers are-" +result);
        return result;




    }
}
