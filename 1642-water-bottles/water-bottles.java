class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        // int total = numBottles;
        // int empty = numBottles;
        // while (empty >= numExchange)
        // {
        //     int newBottles = empty / numExchange;
        //      total += newBottles;
        //      empty = newBottles + (empty%numExchange);
        // }
        // return total;
        int ans = numBottles;
        while (numBottles >= numExchange)

        {
            int newbottle = numBottles/numExchange;
            ans = ans + newbottle;
            int remainingbottle = numBottles%numExchange;
            numBottles = newbottle+remainingbottle;
        }
        return ans;
    }
}                                                                             