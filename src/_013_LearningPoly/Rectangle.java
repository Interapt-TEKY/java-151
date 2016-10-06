package _013_LearningPoly;

/**
 * Created by kpascascio on 10/6/16.
 */
public class Rectangle extends Shapes {
    private int width;
    private int height;

    public Rectangle(int xcor, int ycor, int w, int h) {
        super(xcor, ycor);
        setWidth(w);
        setHeight(h);
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public void setWidth(int w){
        width = w;
    }

    public void setHeight(int h){
        height = h;
    }

//    CHALLENGE: Write an override method for the Draw method that's in our super class
//               Make sure we are printing out the new values that we have created.
    public void draw(){
        System.out.print("Drawing rectangle at: x: " + getX() + ", y: " + getY() +
                " width: " + getWidth() + ", height: " + getHeight());
    }
}
