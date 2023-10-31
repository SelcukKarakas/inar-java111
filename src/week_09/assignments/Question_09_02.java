package week_09.assignments;

public class Question_09_02 {


        /** Main method */
        public static void main(String[] args) {
            // Create a Stock object with the stock
            // symbol ORCL, the name Oracle Corporation
            Stocks stock = new Stocks("ORCL", "Oracle Corporation");
            stock.previousClosingPrice = 34.5;
            stock.currentPrice = 34.35;

            // Display the price-change percentage
            System.out.println("\nStock name: " + stock.name);
            System.out.println("Stock symbol: " + stock.symbol);
            System.out.printf("Price-change percentage: %.2f%%\n",
                    stock.getChangePercent());
        }

}
