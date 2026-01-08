class Solution {
    public int[] finalPrices(int[] price) {

        int[] prices = new int[price.length + 1];

        for(int i = 0; i < price.length; i++) {
            prices[i] = price[i];
        }

        for(int i = 0; i <  prices.length - 2; i++) {
            int j = i + 1;
            while(j < prices.length - 1 && prices[j] > prices[i] ) {
                j++;
            }
            price[i] = prices[i] - prices[j];
        }
        return price;
    }
}