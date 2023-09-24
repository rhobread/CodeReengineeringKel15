
class Main {
	public static void calcAndPrint(String shapeType, int side, int width) {
	    double area = 0;

	    if (shapeType == "square") {
	        area = side * side;
	    } else if (shapeType == "rectangle") {
	        area = side * width;
	    } else if (shapeType == "circle") {
	        area = 3.14 * side * side;
	    }

	    System.out.println("Area of " + shapeType + " : " + area);
	}
	
    public static void main(String[] args) {
    
        int squareSide = 7;
        int rectangleWidth = 8;
        int rectangleHeight = 3;
        int circleRadius = 10;

        // getting areas
        calcAndPrint("square", squareSide, 0);
        calcAndPrint("rectangle", rectangleWidth, rectangleHeight);
        calcAndPrint("circle", circleRadius, 0);
    }
}
