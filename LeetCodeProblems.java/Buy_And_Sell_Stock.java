import java.util.Arrays;

public class Buy_And_Sell_Stock {

    static int[] price = { 7, 6, 4, 3, 1 }; // This approach correct for this problem
    static int low = price[0];
    static int max;

    static int buy_day;

    public static int day(int[] price) {

        for (int i = 1; i < price.length; i++) {
            if (price[i] < low) {
                low = price[i];
                buy_day = i;
            } 
        return buy_day;
    }

    public static int profit_day(int[] price) {

        max = price[buy_day + 1];

        for (int i = buy_day + 2; i < price.length; i++) {
            if (price[i] > max) {
                max = price[i];
            }
        }

        return max;

    }

    public static void display() {
        System.out.println(max - low);
    }

    // public int maxProfit(int[] prices) { // Right approach for all problems

    // int buy=Integer.MAX_VALUE,sell=0;
    // for(int i=0;i<prices.length;i++){
    // buy=Math.min(buy,prices[i]);
    // sell=Math.max(sell,prices[i]-buy);
    // }
    // return sell;

    // }

    public static void main(String[] args) {

        day(price);
        profit_day(price);
        display();

    }
}
