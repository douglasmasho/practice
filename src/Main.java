public class Main {
    public static void main(String[] args) {
        Company AirKing = new Company();
        Inverter aircon1 = new Inverter(5000);
        Inverter aircon2 = new Inverter(9000);
        Inverter aircon3 = new Inverter(12000);
        NoInverter aircon4 = new NoInverter(5000);
        NoInverter aircon5 = new NoInverter(9000);
        NoInverter aircon6 = new NoInverter(12000);


        AirKing.addAirCon(aircon1);
        AirKing.addAirCon(aircon2);
        AirKing.addAirCon(aircon3);
        AirKing.addAirCon(aircon4);
        AirKing.addAirCon(aircon5);
        AirKing.addAirCon(aircon6);


        AirKing.HowMuchIfAllSold();
        AirKing.NumberOfInverters();
        try{
           AirKing.AveragePriceNoInverter();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
