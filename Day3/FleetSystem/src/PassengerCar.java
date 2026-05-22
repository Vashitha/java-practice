public class PassengerCar extends Vehicle{
    private int passengerCapacity;

    public PassengerCar(String vin, double baseDailyRate, int passengerCapacity){
        super(vin,baseDailyRate);
        this.passengerCapacity=passengerCapacity;
    }

    @Override
    public double calculateRentalCost(int days){
        double vehCost=super.calculateRentalCost(days);
        if(this.passengerCapacity>4){
            vehCost=vehCost+(15.0*days);
        }
        return vehCost;
    }
}
