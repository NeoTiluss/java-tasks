import java.util.Scanner;

public class BinaryAddition {
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;

        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            result.insert(0, sum % 2);
            carry = sum / 2;
        }

        if (carry > 0) {
            result.insert(0, carry);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first binary string: ");
        String a = scanner.nextLine();

        System.out.print("Enter the second binary string: ");
        String b = scanner.nextLine();

        String sum = addBinary(a, b);
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);

        scanner.close();
    }
}
