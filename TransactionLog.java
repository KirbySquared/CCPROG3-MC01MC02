package GUIINTERFACE;

import java.util.ArrayList;

/**
 * Represents a transaction log that keeps track of sales and total sales.
 * The TransactionLog class maintains a list of sales and the total sales amount.
 */
public class TransactionLog {

    /**
     * The list of sales in the transaction log.
     */
    private ArrayList<Sale> sales;

    /**
     * The total sales amount.
     */
    private int totalSales;

    /**
     * Constructs an empty transaction log.
     * Initializes the TransactionLog object with an empty list of sales and total sales amount as 0.
     */
    public TransactionLog () {
        this.sales = new ArrayList<>(8);
        totalSales = 0;
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
     * Calculates the total sales amount by summing up the prices of all items in the sales list.
     */
    public void updateTotalSales()
    {
        totalSales = 0;
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
