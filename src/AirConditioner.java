public abstract class AirConditioner {
    protected int BTU;
    private double basePrice;

    public AirConditioner(int newBTU){
        BTU = newBTU;
    }

    public abstract double GetPrice();
}
