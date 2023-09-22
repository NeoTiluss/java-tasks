import java.util.Scanner;

public class StaircaseClimbing {
    public static int countVariants(int stairsCount) {
        // Initialize an array to store the number of ways to reach each step
        int[] ways = new int[stairsCount + 1];

        // Base cases
        ways[0] = 1; // There's one way to stay on the ground floor (no steps taken)
        ways[1] = 1; // There's one way to reach the first step (take 1 step)

        // Calculate the number of ways for each step
        for (int i = 2; i <= stairsCount; i++) {
            ways[i] = ways[i - 1] + ways[i - 2];
        }

        // The result is stored in ways[stairsCount]
        return ways[stairsCount];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of stairs: ");
        int stairsCount = scanner.nextInt();

        int variants = countVariants(stairsCount);
        System.out.println("Number of ways to climb " + stairsCount + " stairs: " + variants);

        scanner.close();
    }
}
