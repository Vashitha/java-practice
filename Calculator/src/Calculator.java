import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Scanner scanner = new Scanner(System.in);
        boolean wantToContinue= true;

        while (wantToContinue){
            try{
                System.out.println("Enter the first no: ");
                Double firstNo = scanner.nextDouble();
                System.out.println("Enter the operator (+,-,*,/): ");
                String oper=scanner.next();
                System.out.println("Enter the second no: ");
                Double secondNo = scanner.nextDouble();
                Double result=0.0;
                switch(oper){
                    case "+":result=firstNo+secondNo;
                        break;
                    case "-": result=firstNo-secondNo;
                        break;
                    case "*":result=firstNo*secondNo;
                        break;
                    case "/":
                        if(secondNo == 0){
                            System.out.println("Second no is zero and cannot be divided");
                            break;
                    }
                        result=firstNo/secondNo;
                        break;
                    default: System.out.println("Invalid identifier");
                }
                System.out.println("Result is: "+result);
                System.out.println("Do you wish to continue (y/n):");
                char contCalc = scanner.next().toLowerCase().charAt(0);
                if(contCalc!='y'){
                    wantToContinue=false;
                }

            } catch (Exception e) {
                System.out.println("Error occurred "+e);
            }

        }
        scanner.close();
    }
}