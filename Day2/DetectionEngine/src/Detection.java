public class Detection {
    int deviceId;
    String deviceType;
    boolean isFlagged;
    double lastTransactionAmount;

    public Detection(int deviceId, String deviceType, boolean isFlagged, double lastTransactionAmount){
        this.deviceId=deviceId;
        this.deviceType=deviceType;
        this.isFlagged=isFlagged;
        this.lastTransactionAmount=lastTransactionAmount;
    }

    public void updateActivity(double amount){
        this.lastTransactionAmount = amount;
        if(this.lastTransactionAmount > 10000.0)
            this.isFlagged=true;
    }

    public void updateActivity(double amount, String location){
        updateActivity(amount);
        if(this.lastTransactionAmount > 5000.0 && "Suspicious".equals(location))
            this.isFlagged=true;
    }
    public static void main(String[] args) {
            Detection d1=new Detection(101,"Mobile",false,0.0);
            d1.updateActivity(10000.0);
            Detection d2=new Detection(102,"Mobile",false,0.0);
            d2.updateActivity(5000.0,"Suspicious");
            System.out.println(d1.lastTransactionAmount +" "+d1.isFlagged);
            System.out.println(d2.lastTransactionAmount +" "+d2.isFlagged);
    }
}