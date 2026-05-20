import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean continueSwap=true;
        while(continueSwap){
            System.out.println("Enter the first no: ");
            int firstNo=scanner.nextInt();
            System.out.println("Enter the second no: ");
            int secondNo=scanner.nextInt();
            int temp=firstNo;
            firstNo=secondNo;
            secondNo=temp;
            System.out.println("After Swap!");
            System.out.println("First no is "+firstNo+" and second no is "+secondNo);
            System.out.println("Do you wish to continue (y/n)");
            char wishToCont = scanner.next().toLowerCase().charAt(0);
            if(wishToCont!='y')
                continueSwap=false;
        }
    }
}