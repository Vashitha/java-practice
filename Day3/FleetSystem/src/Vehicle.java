//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Vehicle {
    private String vin;
    private double baseDailyRate;

    public Vehicle(String vin, double baseDailyRate){
        this.vin=vin;
        this.baseDailyRate=baseDailyRate;
    }

    public String getVin(){
        return this.vin;
    }

    public double getBaseDailyRate(){
        return this.baseDailyRate;
    }

    public double calculateRentalCost(int days){
        return this.baseDailyRate*days;
    }
}