import java.util.Scanner;

public class StockCommission {
	public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);

        
        double PriceOfShare = 0;
        int numberOfShares = 0;

        
       
            System.out.print("Enter the share price, it should be greater than $0 and less than or equal to $500: ");
            PriceOfShare = kb.nextDouble();

            
            while (PriceOfShare <= 0 || PriceOfShare > 500) {
                System.out.println("Invalid input. Please reenter a valid value between $0 and $500.");
                PriceOfShare = kb.nextDouble();
            }
        

        
       
            System.out.print("Enter the number of shares between 100 and 100,000: ");
            numberOfShares = kb.nextInt();

           
            while (numberOfShares < 100 || numberOfShares > 100000) {
                System.out.println("Invalid input. Please reenter a valid number between 100 and 100,000.");
                numberOfShares = kb.nextInt();
            }
        

        // Calculate the stock cost (number of shares * share price)
        double stockCost = numberOfShares * PriceOfShare;

        // Calculate the commission (4.25% of stock cost)
        double commission = stockCost * 4.25 / 100;

        // Calculate the total cost (stock cost + commission)
        double total = stockCost + commission;

        // Display the stock cost, commission, and total
        System.out.println("Stock cost: $" + stockCost);
        System.out.println("Commission: $" + commission);
        System.out.println("Total amount: $" + total);

        // Close the scanner to prevent resource leak
        kb.close();
    }
}
