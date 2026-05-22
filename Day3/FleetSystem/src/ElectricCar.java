public class ElectricCar extends PassengerCar {
    private double batteryEffeciency;

    public ElectricCar(String vin, double baseDailyRate, int passengerCapacity, double batteryEffeciency) {
        super(vin, baseDailyRate, passengerCapacity);
        this.batteryEffeciency = batteryEffeciency;
    }

    @Override
    public double calculateRentalCost(int days) {
        double totalCost = super.calculateRentalCost(days);
        totalCost = -totalCost - (totalCost * this.batteryEffeciency);
        return totalCost;
    }

    public static void main(String[] args){
        ElectricCar ec=new ElectricCar("1010",10,4,0.10);
        double cost=ec.calculateRentalCost(10);
        System.out.println("Final total is: "+cost);
    }
}
