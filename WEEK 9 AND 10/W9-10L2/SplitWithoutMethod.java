import java.util.Scanner;

public class SplitWithoutMethod {

    // Find length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    // Count words
    public static int countWords(String str) {
        int count = 1; // at least 1 word
        int len = findLength(str);

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    // Split using charAt()
    public static String[] splitText(String str) {
        int len = findLength(str);
        int words = countWords(str);

        int[] spaceIndexes = new int[words - 1];
        int index = 0;

        // Store space positions
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        String[] result = new String[words];

        int start = 0;
        for (int i = 0; i < words; i++) {
            int end;

            if (i == words - 1) {
                end = len;
            } else {
                end = spaceIndexes[i];
            }

            String temp = "";
            for (int j = start; j < end; j++) {
                temp += str.charAt(j);
            }

            result[i] = temp;
            start = end + 1;
        }

        return result;
    }

    // Compare two string arrays
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] manualSplit = splitText(text);
        String[] builtInSplit = text.split(" ");

        System.out.println("\nManual Split:");
        for (String word : manualSplit) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in Split:");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        boolean result = compareArrays(manualSplit, builtInSplit);

        System.out.println("\nAre both same? " + result);

        sc.close();
    }
}
