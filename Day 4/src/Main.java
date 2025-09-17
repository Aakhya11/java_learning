import com.addition.Addition;
import com.calculator.CalculatorController;
import com.division.Division;
import com.multiplication.Multiplication;
import com.subtraction.Subtraction;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        float f= 2.0F;
        int d=0;
        System.out.println("decimal result :" +(f/d));
        //write a calculator program for addition, sub, mul and div where we will use min 4 classes
        //in this program we will use two variables for number input and one var we will take for storing the result.
        //the calculator is made using switch-case condition.


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first numbers ");
        int num1= sc.nextInt();
        System.out.println("enter the second number");
        int num2 = sc.nextInt();
        System.out.println("enter the operation you want to perform (+,-,*,/)");
        char op=sc.next().charAt(0);
        int result=0;

        switch (op){
            case '+':
                result= Addition.sumOfNums(num1,num2);
                break;

            case '-':
                result= Subtraction.subOfNums(num1,num2);
                break;

            case '*':
                result= Multiplication.mulOfNums(num1,num2);
                break;

            case '/':
                result= Division.divOfNums(num1,num2);
                break;
            default:
                System.out.println("ivalid operator!");
                return;

        }




        System.out.println("calculation of two numbers are-" +result);
    }
}