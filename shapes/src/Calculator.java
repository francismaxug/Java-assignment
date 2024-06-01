//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculator {
    private int a, b;




    public Calculator(){}
    public  Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public  int add(){
       return  a+b;
   }
    public  int multiply(){
        return  a*b;
    }
    public  int divide(){
        return  a / b;
    }
    public  int subtract(){
        return  a+b;
    }

    //method overloading

    public int add(int a , int b){
        return a+b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;

    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}