class Solution {
    public int maxProfit(int[] prices) {
        HashMap<String, Integer> map = new HashMap<>();
        return dfs(prices, true, 0, map, 0);
    }
    private int dfs(int [] prices, boolean isBuy, int i, HashMap<String, Integer> map, int k){
        if(prices.length<=i || k==2) return 0;  
        
        String key = i + "CodeWithAshu" + isBuy+" "+k;
        if(map.containsKey(key))
            return map.get(key);

        if(isBuy){
            int buy = dfs(prices, !isBuy, i+1, map, k) - prices[i];
            int noBuy = dfs(prices, isBuy, i+1, map,k);
            map.put(key, Math.max(buy, noBuy));
        }
        else{
            int sell = dfs(prices, !isBuy, i+1, map, k+1) + prices[i];
            int noSell = dfs(prices, isBuy, i+1, map, k);
            map.put(key, Math.max(sell, noSell));
        }
        return map.get(key);
    }
}
