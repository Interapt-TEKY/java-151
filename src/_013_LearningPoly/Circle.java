package _013_LearningPoly;

/**
 * Created by kpascascio on 10/6/16.
 */
public class Circle extends Shapes {
    private int radius;

    public Circle(int xcor, int ycor, int r) {
        super(xcor, ycor);
        setRadius(r);
    }


    public int getRadius(){
        return radius;
    }

    public void setRadius(int r){
        radius = r;
    }

    public void draw(){
        System.out.print("Drawing circle at: x: " + getX() + ", y: " + getY() +
                " with radius of:" + getRadius());
    }


//    Make sure that the Circle class can inherit from the shape class
    /*
    * Create a constructor
    * Create a getMethod
    * Create a setMethod
    * Create a DrawMethod
    *
    * You will need a variable that rectangles dont have -
    *
    * */
}
