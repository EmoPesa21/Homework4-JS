import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        String myName;
/*
        System.out.printf("|%-13s|%-5s|%n", "Ivancho",2);
        System.out.printf("|%-13s|%-5s|%n", "Ani",5);
        System.out.printf("|%-13s|%-5s|%n", "Mariyaka",6);
        System.out.printf("|%-13s|%-5s|%n", "Pencho",4);
        System.out.printf("|%-13s|%-5s|%n", "Borislavcho",5);

 */
        //Terminal output
        //|Ivancho      |2    |
        //|Ani          |5    |
        //|Mariyaka     |6    |
        //|Pencho       |4    |
        //|Borislavcho  |5    |

                System.out.println("Write your name : ");
                System.out.println("Emre;num2;num3;num4;num5;num6");
        Scanner scannner = new Scanner(System.in);
         myName = scannner.nextLine();
                System.out.printf("|%-13s|%-5s|%n", myName,"6");
         String num2;
         num2 = scannner.nextLine();
                 System.out.printf("|%-13s|%-5s|%n", "Ivancho",2);
         String num3;
         num3 = scannner.nextLine();
                System.out.printf("|%-13s|%-5s|%n", "Ani",5);
         String num4;
         num4 = scannner.nextLine();
                System.out.printf("|%-13s|%-5s|%n", "Mariyaka",6);
         String num5;
         num5 = scannner.nextLine();
                System.out.printf("|%-13s|%-5s|%n", "Pencho",4);
         String num6;
         num6 = scannner.nextLine();
                System.out.printf("|%-13s|%-5s|%n", "Borislavcho",5);
        //Terminal Output:
        /*Write your name :
            Emre;num2;num3;num4;num5;num6
            Emre
            |Emre         |6    |
            num2
            |Ivancho      |2    |
            num3
            |Ani          |5    |
            num4
            |Mariyaka     |6    |
            num5
            |Pencho       |4    |
            num6
            |Borislavcho  |5    |

         */






    }
}
