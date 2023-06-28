import java.util.*;
public class CashInventory {

    private ArrayList<Cash> cashList;
    private ArrayList<Coin> coinsList;

    public CashInventory ()
    {
        this.cashList = new ArrayList<>();
        this.coinsList = new ArrayList<>();
    }

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

    public boolean addCash (Cash cash)
    {
        boolean value = true;

        for (Coin tempcash: cashList)
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

    public void sortCoinsbyValue()
    {
        coinsList.sort(Comparator.comparing(Coin::getValue));
    }

    public void sortCashbyValue()
    {
        cashList.sort(Comparator.comparing(Cash::getValue));
    }

    public ArrayList<Cash> getAvailableCash()
    {
        ArrayList<Cash> templist = new ArrayList<>();

        for (Cash tempcash: cashList)
        {
            if (tempcash.getQuantity() > 0)
            {
                templist.add(tempcash);
            }
        }

        return templist;
    }

    public double getTotalCash()
    {
        double total = 0.0;

        for (Cash tempcash: cashList)
        {   
            total += tempcash.getValue() * tempcash.getQuantity();
        }

        return total;
    }

    public boolean clearCash()
    {   
        boolean value;

         if (cashList.removeAll(cashList) == true)
         value = true;
         else 
         value = false;
         
         return value;
    }

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
