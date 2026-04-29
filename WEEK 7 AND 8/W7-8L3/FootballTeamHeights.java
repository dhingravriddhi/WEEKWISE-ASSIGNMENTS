import java.util.Random;

public class FootballTeamHeights {

    // Method to find sum
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return sum;
    }

    // Method to find mean
    public static double findMean(int[] arr) {
        int sum = findSum(arr);
        return (double) sum / arr.length;
    }

    // Method to find shortest height
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int x : arr) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }

    // Method to find tallest height
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int x : arr) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] heights = new int[11];
        Random rand = new Random();

        // Generate random heights (150–250 cm)
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150;
        }

        // Display heights
        System.out.println("Player Heights:");
        for (int h : heights) {
            System.out.print(h + " ");
        }

        // Calculations
        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findMin(heights);
        int tallest = findMax(heights);

        // Output
        System.out.println("\n\nSum of heights: " + sum);
        System.out.println("Mean height: " + mean);
        System.out.println("Shortest height: " + shortest);
        System.out.println("Tallest height: " + tallest);
    }
}
