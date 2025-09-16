import com.calculator.CalculatorController;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //write a calculator program for addition, sub, mul and div where we will use min 4 classes
        //in this program we will use two variables for number input and one var we will take for storing the result.
        int num1=3, num2=4;
        int result=0;

       result= CalculatorController.calculate(num1,num2);
        System.out.println("caclculation of two numbers are-" +result);
    }
}