import java.util.*;
public class CashInventory {

    private ArrayList<Cash> cashList;
    private ArrayList<Coin> coinsList;

    public CashInventory ()
    {
        this.cashList = new ArrayList<>();
        this.coinsList = new ArrayList<>();
    }

    /* public boolean addCoin (Coin coin)
    {
        boolean value = true;

        for (Coin tempcoin: coinsList)
        {
            if (tempcoin.getValue() == coin.getValue() )
            value = false;
            else
            this.coinsList.add(coin);
        }

        return value;
    } */

    /* public boolean deductCash(double amount)
    {
        boolean value = true;

        return value;
    } */

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

    public boolean clearCash()
    {   
        boolean value;

         if (cashList.removeAll(cashList) == true)
         value = true;
         else 
         value = false;
         
         return value;
    }
    
}
