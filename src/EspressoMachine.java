public class EspressoMachine
{

    private double ouncesPerCup ;
    private double maxGroundsCapacity;
    private double currentGroundsLevel;
    public double Addgrounds;

    public String orderCupOfEspresso;
    public String toString;


    public EspressoMachine()
    {
        ouncesPerCup= 2.0; // set ounces per cup to be strictly 2.0
        maxGroundsCapacity=0.0;
        currentGroundsLevel=0.0;

    }

    public EspressoMachine(double inputmaxGroundsCapacity, double inputcurrentGroundsLevel )
    {
        maxGroundsCapacity = inputmaxGroundsCapacity;
        currentGroundsLevel = inputcurrentGroundsLevel;

    }

    public void setOuncesPerCup(double ouncesPerCup) // setter for ounces for cup
    {
        ouncesPerCup = ouncesPerCup;
    }

    public void setMaxGroundsCapacity(double maxGroundsCapacity) // setter for the input of max grounds
    {
        this.maxGroundsCapacity = maxGroundsCapacity;
    }

    public void setCurrentGroundsLevel(double currentGroundsLevel) // setter for current ground level to not pass max amount
    {
        if (currentGroundsLevel > maxGroundsCapacity )
        {
            currentGroundsLevel = maxGroundsCapacity;
        }

        this.currentGroundsLevel = currentGroundsLevel;
    }


    public void setOrderCupOfEspresso(String orderCupOfEspresso)
    {

        this.orderCupOfEspresso = orderCupOfEspresso;
    }


    public void setToString(String toString)
    {
        this.toString = toString;
    }



    public double getMaxGroundsCapacity() // getter that will save max grounds input by user
    {
        return maxGroundsCapacity;
    }


    public double getCurrentGroundsLevel() // getter that will save current grounds input by user
    {

        return currentGroundsLevel;
    }


    public double getOuncesPerCup() // getter that save ounce per cup which is 2
    {
        return ouncesPerCup;
    }



    public double getAddgrounds() // equation to set current level to its new number if decide to make espresso
    {
        if (currentGroundsLevel >= ouncesPerCup)
        {
            Addgrounds = currentGroundsLevel - ouncesPerCup;
        }

        currentGroundsLevel = Addgrounds;
        return Addgrounds;
    }


    public String getOrderCupOfEspresso() // string will output if person doesnt enough grounds
    {
        orderCupOfEspresso= "We regret the machine is out of espresso. ";
        return orderCupOfEspresso;
    }

    public String getToString() // string message will ouput if user has enough grounds
    {
        toString= "Enjoy this robust cup of espresso. ";
        return toString;
    }
}
