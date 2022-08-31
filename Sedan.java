public class Sedan extends Vehicle{
    public Sedan(String plateNo, int seats, double engineSize){
        super(plateNo, seats, engineSize);
    }

    @Override
    public double GetPrice(double kilometres) {
        return kilometres * 25;
    }
}
