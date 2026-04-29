import java.util.Scanner;

public class FactorsProgram {

    // Method to find factors and store in array
    public static int[] getFactors(int num) {
        int count = 0;

        // First loop → count factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        // Second loop → store factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Sum of factors
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return sum;
    }

    // Product of factors
    public static int getProduct(int[] arr) {
        int product = 1;
        for (int x : arr) {
            product *= x;
        }
        return product;
    }

    // Sum of squares
    public static double getSumOfSquares(int[] arr) {
        double sum = 0;
        for (int x : arr) {
            sum += Math.pow(x, 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = getFactors(num);

        System.out.println("Factors:");
        for (int f : factors) {
            System.out.print(f + " ");
        }

        System.out.println("\nSum of factors: " + getSum(factors));
        System.out.println("Product of factors: " + getProduct(factors));
        System.out.println("Sum of squares: " + getSumOfSquares(factors));

        sc.close();
    }
}