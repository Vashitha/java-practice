public class ExpressPackage extends Package{
    private boolean isOvernight;

    public ExpressPackage(String transactionId, double weight, boolean isOvernight){
        super(transactionId,weight);
        this.isOvernight=isOvernight;
    }

    @Override
    public double calculateShippingCost(){
        double cost=super.calculateShippingCost();
        if(this.isOvernight){
            cost=cost+20.0;
        }
        return cost;
    }

    public static void main(String[] args){
        ExpressPackage ep=new ExpressPackage("101",30.0,true);
        double totalCost= ep.calculateShippingCost();
        System.out.println("Final cost is: "+totalCost);
    }
}
