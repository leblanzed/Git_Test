package src.main.Jun13;

public class MaxProfit {
    public static void main(String[] args) {
        int[] prices = {1,2,4,7,4,3,9,2,1};
        int maxprofit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i-1] )
                maxprofit += prices[i] - prices[i-1];
        }
        System.out.println(maxprofit);
    }
}
