import java.util.ArrayList;

public class CabCompany {
    private ArrayList<Vehicle> vehicles;

    public CabCompany(){
        vehicles = new ArrayList<Vehicle>();
    }

    public void AddVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public String CheaperMinibus(double kilometres){
        //since the first element in the array could be a bus or a sedan, we need to use the smalles possible number instead of the fist vehicle's price
        double cheapestPrice = Double.NEGATIVE_INFINITY;
        String cheapestPlate = "";
        for(int i = 0; i < vehicles.size(); i++){
            if(vehicles.get(i) instanceof Minibus && vehicles.get(i).GetPrice(kilometres) < cheapestPrice){
                cheapestPrice = vehicles.get(i).GetPrice(kilometres);
                cheapestPlate = vehicles.get(i).GetPlateNum();
            }
        }
        return cheapestPlate;
    }

    public int HowManySedan(){
        int count = 0;
        for(int i = 0; i < vehicles.size(); i++){
            if(vehicles.get(i) instanceof Sedan){
                count++;
            }
        }
        return count;
    }
}
