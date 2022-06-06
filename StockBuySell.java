import java.util.ArrayList;

public class StockBuySell {
    public static int maximumProfit(ArrayList<Integer> prices){
        long min = Long.MAX_VALUE, max = 0;
        for (Integer price : prices) {
            if (price < min) min = price;
            max = Math.max(max, price - min);
        }
        return (int)max;
    }
}
