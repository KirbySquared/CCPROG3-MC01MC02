package GUIINTERFACE;
import java.util.*;

/**
 * Represents the inventory of cash and coins in a vending machine.
 */
public class CashInventory {

    /**
     * The list of cash items in the inventory.
     */
    private ArrayList<Cash> cashList;

     /**
     * The list of coins in the inventory.
     */
    private ArrayList<Coin> coinsList;

    /**
     * Constructs an empty cash inventory.
     */
    public CashInventory ()
    {
        this.cashList = new ArrayList<>();
        this.coinsList = new ArrayList<>();
    }

    /**
     * Adds a coin to the inventory.
     *
     * @param coin the coin to be added
     * @return true if the coin was successfully added, false otherwise
     */
    public boolean addCoin (Coin coin)
    {
        boolean value = true;

        for (Coin tempcoin: coinsList)
        {
            if (tempcoin.getValue() == coin.getValue() )
            {
                value = false;
                break;
            }
        }

        if (value == true)
        this.coinsList.add(coin);

        return value;

    } 

    /**
     * Adds cash to the inventory.
     *
     * @param cash the cash to be added
     * @return true if the cash was successfully added, false otherwise
     */
    public boolean addCash (Cash cash)
    {
        boolean value = true;

        for (Cash tempcash: cashList)
        {
            if (tempcash.getValue() == cash.getValue() )
            {
                value = false;
                break;
            }
        }

        if (value == true)
        this.cashList.add(cash);

        return value;
    } 

    /**
     * Adds the specified quantity to the coin with the given value in the inventory.
     *
     * @param coinvalue the value of the coin
     * @param quantity  the quantity to be added
     * @return true if the quantity was successfully added, false otherwise
     */
    public boolean addcoinQuantity(int coinvalue, int quantity)
    {
        boolean value = false;
        int tempcoin = 0;

        if (quantity > 0)
        {
            for (Coin temp: coinsList)
            {
                if (coinvalue == temp.getValue() )
                {
                    value = true;
                    tempcoin = coinsList.indexOf(temp);
                    break;
                }
            }

        }
        if (value == true)
        {
            coinsList.get(tempcoin).addQuantity(quantity);
        }

        return value;
    }

    /**
     * Adds the specified quantity to the cash with the given value in the inventory.
     *
     * @param cashvalue the value of the cash
     * @param quantity  the quantity to be added
     * @return true if the quantity was successfully added, false otherwise
     */
    public boolean addcashQuantity(int cashvalue, int quantity)
    {
        boolean value = false;
        int tempcash = 0;

        if (quantity > 0)
        {
            for (Cash temp: cashList)
            {
                if (cashvalue == temp.getValue() )
                {
                    value = true;
                    tempcash = cashList.indexOf(temp);
                    break;
                }
            }

        }
        if (value == true)
        {
            cashList.get(tempcash).addQuantity(quantity);
        }

        return value;
    }

     /**
     * Reduces the quantity of the coin with the given value in the inventory by the specified amount.
     *
     * @param coinvalue the value of the coin
     * @param quantity  the quantity to be reduced
     * @return true if the quantity was successfully reduced, false otherwise
     */
    public boolean reducecoinQuantity(int coinvalue, int quantity)
    {
        boolean value = false;
        int tempcoin = 0;

        if (quantity > 0)
        {
            for (Coin temp: coinsList)
            {
                if (coinvalue == temp.getValue() )
                {
                    value = true;
                    tempcoin = coinsList.indexOf(temp);
                    break;
                }
            }

        }
        if (value == true)
        {
            coinsList.get(tempcoin).deductQuantity(quantity);
        }
        
        return value;
    }

    /**
     * Reduces the quantity of the cash with the given value in the inventory by the specified amount.
     *
     * @param cashvalue the value of the cash
     * @param quantity  the quantity to be reduced
     * @return true if the quantity was successfully reduced, false otherwise
     */
    public boolean reducecashQuantity(int cashvalue, int quantity)
    {
        boolean value = false;
        int tempcash = 0;

        if (quantity > 0)
        {
            for (Cash temp: cashList)
            {
                if (cashvalue == temp.getValue() )
                {
                    value = true;
                    tempcash = cashList.indexOf(temp);
                    break;
                }
            }

        }
        if (value == true)
        {
            cashList.get(tempcash).deductQuantity(quantity);
        }
        
        return value;
    }

    /**
     * Sorts the coins in the inventory by their value.
     */
    public void sortCoinsbyValue()
    {
        coinsList.sort(Comparator.comparing(Coin::getValue));
    }

     /**
     * Sorts the cash items in the inventory by their value.
     */
    public void sortCashbyValue()
    {
        cashList.sort(Comparator.comparing(Cash::getValue));
    }

     /**
     * Returns the list of cash items in the inventory.
     *
     * @return the list of cash items
     */
    public ArrayList<Cash> getcashList()
    {
        return this.cashList;
    }

     /**
     * Returns the list of coins in the inventory.
     *
     * @return the list of coins
     */
    public ArrayList<Coin> getcoinsList()
    {
        return this.coinsList;
    }

    /**
     * Calculates the total value of cash and coins in the inventory.
     *
     * @return the total value of cash and coins
     */
    public int getTotalCash()
    {
        int total = 0;

        for (Cash tempcash: cashList)
        {   
            total += tempcash.getValue() * tempcash.getQuantity();
        }

        for (Coin tempcoin: coinsList)
        {   
            total += tempcoin.getValue() * tempcoin.getQuantity();
        }

        return total;
    }

    /**
     * Clears the cash inventory.
     *
     * @return true if the cash inventory was successfully cleared, false otherwise
     */
    public boolean clearCash()
    {   
        boolean value;

         if (cashList.removeAll(cashList) == true)
         value = true;
         else 
         value = false;
         
         return value;
    }

     /**
     * Clears the coin inventory.
     *
     * @return true if the coin inventory was successfully cleared, false otherwise
     */
    public boolean clearCoins()
    {
        boolean value;

         if (coinsList.removeAll(coinsList) == true)
         value = true;
         else 
         value = false;
         
         return value;
    }
}
