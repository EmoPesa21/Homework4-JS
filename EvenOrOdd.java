import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

            double Num;
        System.out.println("Enter random number:");

                Scanner scanner = new Scanner(System.in);
                Num = scanner.nextDouble();
            boolean IsEvenorIsOdd = Num == 0 && Num <= 0;
        System.out.printf("Is the number even or odd : " + (Num%2),"\t");
                    String output = IsEvenorIsOdd ? "\tEven" : "\tOdd";
        System.out.println(output);
    }
}
/* TERMINAL OUTPUT
If it is Odd...
Enter random number:
21
Is the number even or odd : 1.0	Odd
If it is Even...
Enter random number:
10
Is the number even or odd : 0.0	Even

Единственият проблем, който имам е, че не мога да напиша кода да ми задава четно и нечетно, в зависимост
от числото, което се получи...
 */
