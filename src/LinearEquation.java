public class LinearEquation {
    //the instance variables
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    //the constructor
    public LinearEquation(int numX1, int numX2, int numY1, int numY2){
        numX1 = x1;
        numX2 = x2;
        numY1 = y1;
        numY2 = y2;
    }
    //the method used to find slope
    public double findSlope(int numX1, int numX2, int numY1, int numY2){
        double slope = (double)(numY2 - numY1) / (double) (numX2 - numX1);
        return slope;
    }

    //the method used to find yIntercept using the found slope
    public double yIntercept(int x1, int y1, double slope){
        double intercept = y1 - (slope * x1);
        return  intercept;
    }

    //the distance calculator using the 2 coordinate points
    public double distance(int x1, int x2, int y1, int y2){
        double distance = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        return distance;
    }

}
