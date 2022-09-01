public class CompanyProblem {
    public static void main(String[] args){
        CabCompany company = new CabCompany();
        Minibus minimbus1 = new Minibus("123", 13, 200);
        Bus bus1 = new Bus("124", 13, 200);
        Sedan sedan1 = new Sedan("125", 13, 200);

        company.AddVehicle(minimbus1);
        company.AddVehicle(bus1);
        company.AddVehicle(sedan1);

        System.out.println(company.GetAllCars());

    }
}
