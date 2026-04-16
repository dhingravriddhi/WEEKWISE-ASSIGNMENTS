import java.util.Scanner;

public class FriendStats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        for (int i = 0; i < 3; i++) {
            ages[i] = sc.nextInt();
            heights[i] = sc.nextDouble();
        }

        int youngestIdx = 0;
        int tallestIdx = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIdx]) {
                youngestIdx = i;
            }
            if (heights[i] > heights[tallestIdx]) {
                tallestIdx = i;
            }
        }

        System.out.println("Youngest: " + names[youngestIdx]);
        System.out.println("Tallest: " + names[tallestIdx]);
        sc.close();
    }
}