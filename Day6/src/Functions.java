//In Java, a function is called a method.
//It is a block of code that performs a specific task and can return a value or not.
//There are four types of function in java.
//1. No return type, no parameters.
//2. Return type with no parameters.
//3. No return type with parameters.
//4. Return type with parameters.

import java.util.Scanner;

public class Functions {

    public void func1(){
        System.out.println("enter two numbers");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        int sum=a+b;
        System.out.println("addition of two numbers are:" +sum);
    }
    public int func2(){
        System.out.println("enter two numbers");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        int sub=a-b;
        return sub;
    }
    public void func3(int a, int b){
        int mul=a*b;
        System.out.println("multiplication of two numbers are :"+mul);
    }
    public int func4(int a, int b){
        int div=a/b;
        return div;
    }
    public static void main(String [] args){
        Functions obj=new Functions();
        obj.func1();
        int sub= obj.func2();

        System.out.println("subtraction of two numbers are:"+sub);

        obj.func3(2,4);
        int div=obj.func4(10,5);
        System.out.println("division of two numbers are:"+div);


    }
}
6