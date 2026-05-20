import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the list: ");
        int size=scanner.nextInt();
        scanner.nextLine();
        String[] fruits = new String[size];
        for (int i=0;i< fruits.length;i++) {
            System.out.printf("Enter the value: ");
            fruits[i]= scanner.nextLine();
        }
        System.out.println("Array is: "+ Arrays.toString(fruits));

    }
}