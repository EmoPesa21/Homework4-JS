import java.util.Scanner;

public class GradingNumber {
    public static void main(String[] args) {
        double Num;
        System.out.println("Enter random number:");
            Scanner scanner = new Scanner(System.in);
        Num = scanner.nextDouble();
        System.out.printf("Graded numer equals : %,.5f" , (Math.pow(Num,2)));

    }
}

// TERMINAL OUTPUT:
//Enter random number:
//28
//Graded numer equals : 784.00000