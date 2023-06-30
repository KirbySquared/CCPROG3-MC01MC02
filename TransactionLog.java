import java.util.*;

public class TransactionLog {
    private ArrayList<Sale> sales;
    private double totalSales;

    public TransactionLog () {
        this.sales = new ArrayList<>(8);
        totalSales = 0.0;
    }


    public void addSale(Sale sale) 
    {
        sales.add(sale);
    }

    public ArrayList<Sale> getsalesList()
    {
        return this.sales;
    }

    public void updateTotalSales()
    {
        totalSales = 0.0;
        for (Sale tempsale: sales)
        {
            totalSales += tempsale.getItem().getPrice() * tempsale.getQuantity();
        }
    }

    public double getTotalSales()
    {
        return totalSales;
    }

}
