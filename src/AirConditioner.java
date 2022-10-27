public abstract class AirConditioner {
    protected int BTU;

    public AirConditioner(int newBTU){
        BTU = newBTU;
    }

    public abstract double GetPrice();
}
