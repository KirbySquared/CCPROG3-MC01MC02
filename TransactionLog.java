import java.util.*;

/**
 * Represents a transaction log that keeps track of sales and total sales.
 */
public class TransactionLog {

    /**
     * The list of sales in the transaction log.
     */
    private ArrayList<Sale> sales;

    /**
     * The total sales amount.
     */
    private double totalSales;

    /**
     * Constructs an empty transaction log.
     */
    public TransactionLog () {
        this.sales = new ArrayList<>(8);
        totalSales = 0.0;
    }

     /**
     * Adds a sale to the transaction log and updates the total sales amount.
     *
     * @param sale the sale to be added
     */
    public void addSale(Sale sale) 
    {
        sales.add(sale);
        updateTotalSales();
    }

    /**
     * Returns the list of sales in the transaction log.
     *
     * @return the list of sales
     */
    public ArrayList<Sale> getsalesList()
    {
        return this.sales;
    }

    /**
     * Updates the total sales amount based on the sales in the transaction log.
     */
    public void updateTotalSales()
    {
        totalSales = 0.0;
        for (Sale tempsale: sales)
        {
            totalSales += tempsale.getItem().getPrice() * tempsale.getQuantity();
        }
    }

    /**
     * Returns the total sales amount.
     *
     * @return the total sales amount
     */
    public double getTotalSales()
    {
        return totalSales;
    }

}
