//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Wallet {
    int walletId;
    String ownerName;
    double balance;
    public Wallet(int walletId, String ownerName, double balance){
        this.walletId=walletId;
        this.ownerName=ownerName;
        this.balance=balance;
    }

    public void addFunds(double amount){
        if(amount>0){
            this.balance +=amount;
        }
    }

    public void addFunds(double amount, String promoCode){
        if("WELCOME".equals(promoCode)){
            this.balance +=(amount+50.0);
        }
    }
    public static void main(String[] args) {
            Wallet w1=new Wallet(100,"Guest",0.0);
            w1.addFunds(50);
            System.out.println(w1.balance);
            w1.addFunds(50,"WELCOME");
            System.out.println(w1.balance);
    }
}