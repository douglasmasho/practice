import java.util.ArrayList;

public class Company {
    private ArrayList<AirConditioner> aircons;

    public Company(){
        aircons = new ArrayList<AirConditioner>();
    }


    public void addAirCon(AirConditioner newAirCon){
        aircons.add(newAirCon);
    }

    public void removeAirCon(AirConditioner airConToBeRemoved){
        aircons.remove(airConToBeRemoved);
    }

    public double HowMuchIfAllSold(){
        double amount = 0;
        for(AirConditioner i:aircons){
            amount += i.GetPrice();
        }
        return amount;
    }

    public int NumberOfInverters(){
        int count = 0;
        for(AirConditioner i : aircons){
            if(i instanceof Inverter){
                count++;
            }
        }
        return count;
    }




    public double AveragePriceNoInverter() throws Exception{
        int count = 0;
        double total = 0;
        for(AirConditioner i : aircons){
            if(i instanceof NoInverter){
                count++;
                total += i.GetPrice();
            }
        }
        if(count == 0){
            throw new Exception("There are no Inverters");
        }
        return (double) total/count;
    }
}
