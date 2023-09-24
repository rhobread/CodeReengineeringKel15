import java.util.Scanner;

public void calculateSquareArea() {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter side length: ");
    int side = scanner.nextInt();

    return side * side;
    scanner.close();
}

public void calculateRectangleArea() {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter width: ");
    int width = scanner.nextInt();

    System.out.print("Enter height: ");
    int height = scanner.nextInt();

    return height * width;
    scanner.close();
}

public void calculateCircleArea() {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter radius: ");
    double radius = (double) scanner.nextInt();

    return 3.14 * radius * radius;
    scanner.close();
}

//

public void menu() {
    Scanner scanner = new Scanner(System.in);
    do {
        System.out.println("Menu\n========");
        System.out.println("1. Calculate Rectangle Area");
        System.out.println("2. Calculate Square Area");
        System.out.println("3. Calculate Circle Area");
        System.out.println("0. Exit");
        System.out.print("Input: ");

        int input = scanner.nextInt();
        if (input == 1) {
        	shapeName = "Rectangle";
            shapeArea = calculateRectangleArea();
        } else if (input == 2) {
        	shapeName = "Square";
            shapeArea = calculateSquareArea();
        } else if (input == 3) {
        	shapeName = "Circle";
            shapeArea = calculateCircleArea();
        }
        if (input >= 1 && input <= 3) {
        	System.out.println("Area of" + shapeName + ":" + shapeArea);
        }
    } while (input != 0);

    scanner.close();
}

class Main {
    public static void main(String[] args) {
        menu();
    }
}