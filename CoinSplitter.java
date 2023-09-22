public class CoinSplitter {
    public static void main(String[] args) {
        if (args.length != 1) {
            // Check for correct command-line usage
            System.out.println("Please provide the amount in tetri as a command-line argument.");
            return;
        }

        int amount = Integer.parseInt(args[0]);
        int minCoins = minSplit(amount);
        System.out.println("Minimum coins required: " + minCoins);
    }

    public static int minSplit(int amount) {
        int[] coins = {50, 20, 10, 5, 1};
        int coinCount = 0;

        for (int coin : coins) {
            int count = amount / coin;
            coinCount += count;
            amount -= count * coin;
        }

        return coinCount;
    }
}
