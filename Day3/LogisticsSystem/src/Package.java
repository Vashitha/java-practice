
public class Package {
    private String trackingId;
    private double weight;

    public Package(String trackingId, double weight){
        this.trackingId=trackingId;
        this.weight=weight;
    }

    public String getTrackingId(){
        return this.trackingId;
    }

    public double getWeight(){
        return this.weight;
    }

    public void setWeight(double weight){
        if(weight>0.0)
            this.weight=weight;
    }

    public double calculateShippingCost(){
        double cost=this.weight*5.0;
        return cost;
    }
}