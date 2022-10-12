public class LinearEquation {
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public LinearEquation(int numX1, int numX2, int numY1, int numY2){
        numX1 = x1;
        numX2 = x2;
        numY1 = y1;
        numY2 = y2;
    }
    public double findSlope(int num1, int num2, int num3, int num4){
        double slope = (double)(num4 - num3)/(num2 - num1);
        return slope;
    }
    public double yIntercept(int x1, int y1, double slope){
        double intercept = y1 - (slope * x1);
        return  intercept;
    }

}
