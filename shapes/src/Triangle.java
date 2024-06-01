public class Triangle extends Shape {

    //Triangle class inherits the Shape class.... Meanings all the methods and variables which are accessible
    public Triangle(double base, double height ){
        super(base, height);

    }
    @Override
    public double area(){
        return 0.5 * super.length *super.breath;
    }
}
