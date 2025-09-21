import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ElliVoting {
    public static void main(String [] args){
        int age=0;
        System.out.println("Enter your age:-");
        Scanner sc=new Scanner(System.in);
            age=sc.nextInt();

            if(age<18){
                System.out.println("You are not eligible for voting!");
            }
            else {
                System.out.println("you are eligible for voting!22");
            }



    }
}
