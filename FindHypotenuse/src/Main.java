
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,c;
        System.out.println("Enter the side a: ");
        a=scanner.nextDouble();
        System.out.println("Enter the side b: ");
        b=scanner.nextDouble();
        c=Math.sqrt((a*a)+(b*b));
        System.out.println("Hypotenuse value is: "+c);
    }
}