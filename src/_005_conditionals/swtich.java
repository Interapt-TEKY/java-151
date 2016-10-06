package _005_conditionals;

/**
 * Created by kpascascio on 10/5/16.
 */
public class swtich {
    public static void main(String[] args) {

        int numPiesEaten = 6;

        switch (numPiesEaten) {
            case 0:
                System.out.println("You are hungry");
                break;
            case 6:
                System.out.println("Mighty amount of pies in your belly");
                break;
            case 82:
                System.out.println("You are a god");
                break;
            default:
                System.out.println("You broke something");
                break;

        }
    }
}
