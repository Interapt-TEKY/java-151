package _013_LearningPoly;

/**
 * Created by kpascascio on 10/6/16.
 */
public class Main {
    public static void main(String[] args){
        Shapes s1 = new Shapes(2,3);
        Circle c1 = new Circle(10, 20, 5);
        Rectangle r1 = new Rectangle(50, 100, 10, 20);

        s1.draw();
        System.out.println("\n");
        r1.draw();
        System.out.println("\n");
        c1.draw();
        System.out.println("\n");
    }
}

/*
    Using polymorphism, create a add grade method
    to Teacher class and Student Class

    allow the teacher to input grades in a gradebook

    Then allow a student to add grades to see what
    their average is based on the numbers provided


 */











