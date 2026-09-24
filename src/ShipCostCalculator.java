import java.util.Scanner;

class ShipCostCalculator {

    void main() {
        Scanner in = new Scanner(System.in);
        double shipCost = 0.0;
        double totalCosts = 0;
        double itemPrice = 0;
        final double SHIP_COST_THRESHOLD = 100;
        final double SHIP_RATE = .02;
        String trash = "";
        //get the item price

        IO.println("Enter the item price: ");

        if (in.hasNextDouble())
        {
            itemPrice = in.nextDouble();
            in.nextLine(); //clear the new line from the buffer

            if (itemPrice >= SHIP_COST_THRESHOLD)
            {
                shipCost = 0;
                totalCosts = itemPrice;
            }
            else  //we have shipping cost
            {
                shipCost = itemPrice * SHIP_RATE;
                totalCosts = itemPrice + shipCost;
            }

            IO.print("The shipping cost is " + shipCost);
            IO.println(" The total costs is " + totalCosts);
        }
        else  // got trash
        {
            trash = in.nextLine();
            IO.println("This is an illegal value " + trash);
            IO.println("Run the program again with correct input!");
            System.exit(0);
        }
    }
}
