package _013_LearningPoly;

/**
 * Created by kpascascio on 10/6/16.
 */
public class Shapes {
    private int x;
    private int y;

    public Shapes(int xcor, int ycor){
        setX(xcor);
        setY(ycor);
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int xcor){
        x = xcor;
    }

    public void setY(int ycor){
        y = ycor;
    }

    public  void set(int xcor, int ycor){
        setX(xcor);
        setY(ycor);
    }

    public void draw(){
        System.out.print("Drawing shapes at coordinates: " + getX() + ", " + getY());
    }


}
