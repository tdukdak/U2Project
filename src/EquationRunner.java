import java.util.Scanner;

public class EquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //sequence accepts the first coordinate and parses the coordinate into the first x value and first y value
        System.out.print("Please enter the first coordinate: ");
        String coordinate1 = s.nextLine();
        int x1 = Integer.parseInt(coordinate1.substring(1, coordinate1.indexOf(",")));
        int y1 = Integer.parseInt(coordinate1.substring(coordinate1.indexOf(",")+1, coordinate1.length()-1));

        //sequence accepts the 2nd coordinate and parses the coordinate into the 2nd x value and 2nd y value
        System.out.print("Please enter the second coordinate: ");
        String coordinate2 = s.nextLine();
        int x2 = Integer.parseInt(coordinate2.substring(1, coordinate2.indexOf(",")));
        int y2 = Integer.parseInt(coordinate2.substring(coordinate2.indexOf(",")+1, coordinate2.length()-1));

        //this is the construction of the new object newEquation using the LinearEquation constructor
        LinearEquation newEquation = new LinearEquation(x1, x2, y1, y2);

        //this is the calculations to find the 3 values by calling their methods and using the parameters from the object
        double slope = Math.round(newEquation.findSlope(x1, x2, y1, y2) * 100.0) / 100.0;
        double intercept = Math.round(newEquation.yIntercept(x1, y1, slope) * 100.0) / 100.0;
        double distance = Math.round(newEquation.distance(x1, x2, y1, y2) * 100.0) / 100.0;

        //this chunk of code prints all coordinates and the calculated values
        System.out.println("First pair: " + coordinate1);
        System.out.println("second pair: " + coordinate2);
        System.out.println("slope of the line is: " + slope);
        System.out.println("y-intercept is: " + intercept);
        System.out.println("slope intercept form is: y = " + (y2-y1) + "/" + (x2-x1) + "x + " + intercept);
        System.out.println("The distance between the two points is " + distance);

        //this sequence accepts a user input and runs a calculation that would result in the same output as if it were ran through the slope intercept form and outputs the coordinates with that x input
        System.out.print("enter an x value: ");
        int x = s.nextInt();
        System.out.println(("solved coordinate point is: " + "(" + x + "," + (Math.round(slope * x + intercept)*100.0) / 100.0) + ")");

        //the Math.round on all the calculations are to round to the nearest 100th
    }
}
