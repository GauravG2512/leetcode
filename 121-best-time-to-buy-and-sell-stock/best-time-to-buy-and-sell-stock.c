int maxProfit(int* prices, int pricesSize) 
{
    int min = prices[0];
    int result = 0;
    for(int i = 1; i < pricesSize; i++)
    {
        if(prices[i] < min)
        {
            min = prices[i];
        }   
        int gain = prices[i] - min;
        
        if(gain > result)
        {
            result = gain;
        }
    }   
    return result;
}