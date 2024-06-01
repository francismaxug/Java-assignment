public class Shape {
//Inheritance clas that others will extend
    protected double length, breath;
    public Shape(double length, double breath){
        this.breath =breath;
        this.length = length;
    }


    public double area(){
        return length * breath;
    }
}
