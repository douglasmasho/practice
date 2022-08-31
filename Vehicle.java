public abstract class Vehicle {
    private String plateNum;
    protected int seats;
    private double engineSize;

    public Vehicle(String plateNum, int seats, double engineSize){
        this.plateNum = plateNum;
        this.seats = seats;
        this.engineSize = engineSize;
    }

    public abstract double GetPrice(double kilometres);

    public String GetPlateNum(){
        return plateNum;
    }
}
