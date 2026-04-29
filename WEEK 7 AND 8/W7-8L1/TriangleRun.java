import java.util.Scanner;

public class TriangleRun {

   
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double distance = 5000; 

        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1 (meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 (meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 (meters): ");
        double side3 = sc.nextDouble();

        double rounds = calculateRounds(side1, side2, side3);

        System.out.println("Number of rounds required: " + rounds);

        sc.close();
    }
}