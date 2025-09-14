//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    int a=10;
    public  void wish(){
        System.out.println("GN");
    }
    public static void main(String[] args) {
        Main obj=new Main();
        System.out.println("Hello and welcome! "+obj.a);
        obj.wish();
        datType();
    }
    public static void datType(){
        char ch='c'; //2B
        int b=ch;//4B


        float f=5; //4

        long c=3;   //8

        f=c;

        c=f;

    }
}
//float 4B
//double 8B