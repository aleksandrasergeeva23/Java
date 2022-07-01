import java.sql.SQLOutput;
import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your house length ?");
        double length = in.nextDouble();
        System.out.println("What is your house width ?");
        double width = in.nextDouble();
        System.out.println("What is your house height ?");
        double height = in.nextDouble();
        System.out.println("How many windows do you have ?");
        int windowsNumber = in.nextInt();
        System.out.println("What is one wondow's width ?");
        double windowWidth = in.nextDouble();
        System.out.println("What is one wondow's height ?");
        double windowHeight = in.nextDouble();
        System.out.println("How many doors do you have ?");
        int doorsNumber = in.nextInt();
        System.out.println("What is one door's width ?");
        double doorWidth = in.nextDouble();
        System.out.println("What is one door's height ?");
        double doorHeight = in.nextDouble();
        double amountOfPaint;
        amountOfPaint = ((2 * ((length * height)  + (width * height))) - (doorsNumber * (doorHeight * doorWidth)) - (windowsNumber * (windowHeight * windowWidth)));
        System.out.println("You will need such amout of paint " + amountOfPaint);
        System.out.println("How many m2 will be painted by one color galloon ?");
        double amountOfGalloon = in.nextDouble();
        double galloonNumber = (amountOfPaint / amountOfGalloon);
        System.out.println("You will need these much paint " + galloonNumber);
    }
}
