public class Minibus extends Vehicle{
    public Minibus(String plateNo, int seats, double engineSize){
       super(plateNo, seats, engineSize);
    }

    @Override
    public double GetPrice(double kilometres) {
        return (kilometres * 15)/this.seats;
    }
}
