import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1,number2,number3;
        System.out.println("Please enter a three number");
        System.out.print("number1: ");
        number1 = scanner.nextInt();
        System.out.print("number2: ");
        number2 = scanner.nextInt();
        System.out.print("number3: ");
        number3 = scanner.nextInt();

        if(number1 > number2 && number1 > number3){
            if(number2 > number3){
                System.out.println("number3 < number2 < number1");
            }else{
                System.out.println("number2 < number3 < number1");
            }
        }else if(number2 > number1 && number2 > number3){
            if(number1 > number3){
                System.out.println("number3 < number1 < number2");
            }else{
                System.out.println("number1 < number3 < number2");
            }
        }else{
            if(number1 > number2){
                System.out.println("number2 < number1 < number3");
            }else{
                System.out.println("number1 < number2 < number3");
            }
        }
    }
}
