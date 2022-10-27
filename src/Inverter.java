public class Inverter extends AirConditioner{

    public Inverter(int newBTU){
        super(newBTU);
    }

    @Override
    public double GetPrice(){
        return (BTU * 0.8) + 3000;
    }

}
