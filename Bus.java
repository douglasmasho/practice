public class Bus extends Vehicle{
    public Bus(String plateNo, int seats, double engineSize){
        super(plateNo, seats, engineSize);
    }

    @Override
    public double GetPrice(double kilometres) {
        return (kilometres * 15)/this.seats;
    }
}
