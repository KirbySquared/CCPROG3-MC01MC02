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

    public void sortCoinsbyValue()
    {
        coinsList.sort(Comparator.comparing(Coin::getValue));
    }

    public void sortCashbyValue()
    {
        cashList.sort(Comparator.comparing(Cash::getValue));
    }

    public ArrayList<Cash> getcashList()
    {
        return this.cashList;
    }

    public ArrayList<Coin> getcoinsList()
    {
        return this.coinsList;
    }
    
    public double getTotalCash()
    {
        double total = 0.0;

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
