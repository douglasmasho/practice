public class NoInverter extends AirConditioner{

    public NoInverter(int newBTU){
        super(newBTU);
    }

    @Override
    public double GetPrice(){
        return BTU * 0.8;
    }

}
