class Solution {
    public int maxProfit(int[] prices) {
        HashMap<String, Integer> map = new HashMap<>();
        return dfs(prices, 0, true, map);
    }
    private int dfs(int[] prices, int i, boolean isBuy, HashMap<String, Integer> map){
            if(i>=prices.length) 
                return 0;

            String key = i + "CodeWithAshu" + isBuy;
            if(map.containsKey(key)) 
                return map.get(key);

            if(isBuy){
                int buy = dfs(prices, i+1, !isBuy, map) - prices[i];
                int cool = dfs(prices, i+1, isBuy, map);
                map.put(key, Math.max(buy, cool));
            }
            else{
                int sell = dfs(prices, i+2, !isBuy, map) + prices[i];
                int cool = dfs(prices, i+1, isBuy, map);
                map.put(key, Math.max(sell, cool));
            }
            return map.get(key);
        }
}
