import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       boolean choice = true;
       int sumOdd = 0;
       int sumEven = 0;
       while(choice == true)
       {
        System.out.println("Enter your number: " + "Enter 1 if youn want to stop");
        int n = sc.nextInt();
        if(n == 1) {
            choice = false; 
            break; }
        else{
            if(n % 2 == 0) {
                sumEven+= n;
            }
            else{
                sumOdd+= n;
            }
        }

       }
       System.out.println("The sum of Odd numbers are: " + sumOdd);
       System.out.println("The sum of the Even numbers are: " + sumEven);
       sc.close();
}
}
