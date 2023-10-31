package week_09.assignments;

public class Stocks {

    // Define the stock class

        String symbol;                 // The stock's symbol
        String name;                   // The stock's name
        double previousClosingPrice;	 // The stock price for the previous day
        double currentPrice;				 // The stock price for the current time

        // Construct a stock with a specified symbol and name
        public Stocks (String newSymbol, String newName) {
            symbol = newSymbol;
            name = newName;
        }

        // Return the percentage changed from previousClosingPrice to currentPrice
        double getChangePercent() {
            return ((currentPrice - previousClosingPrice) /
                    previousClosingPrice) * 100;
        }

}
