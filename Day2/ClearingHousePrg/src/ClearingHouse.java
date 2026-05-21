
public class ClearingHouse {
    String accountNo;
    double balance;

    public ClearingHouse(String accountNo, double balance){
        this.accountNo=accountNo;
        this.balance=balance;
    }

    public void transferFunds(double amount, ClearingHouse targetAccount){
        if(amount<=0 || this.balance<amount) {
            System.out.println("Insufficient balance to withdraw");
            return;
        }
        if (targetAccount == null) {
            System.out.println("Target account is null");
            return;
        }
       this.balance-=amount;
       targetAccount.balance+=amount;
    }
    public static void main(String[] args) {
        ClearingHouse ch1=new ClearingHouse("1098651009",100.0);
        ClearingHouse ch2=new ClearingHouse("1098655678",200.0);
        ch1.transferFunds(50,ch2);
        System.out.println(ch1.balance);
        System.out.println(ch2.balance);
    }
}