
import java.util.Scanner;
public class project6 {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);

        // input your number

        System.out.print("Enter first number : ");
        float num1 = input.nextInt();

        System.out.print("Enter second number : ");
        float num2 = input.nextInt();

        System.out.print("Choose your option\n(+)add\n(-)subtract\n(*)muiltiply\n(/)divide\nChoose : ");
        char Choose = input.next().charAt(0);

        switch (Choose) {
            case '+':
               System.out.println("=> "+(num1+num2)); 
            break;
            case '-':
                if (num1>num2) {
                    System.out.println("=> "+(num1-num2));
                }else{
                    System.out.println("please enter first number greater then second number");
                }
            break;
            case '*':
            System.out.println("=> "+(num1*num2)); 
            break;
            case '/':
            if (num1>num2) {
                System.out.println("=> "+(num1/num2));
            }else{
                System.out.println("please enter first number greater then second number");
            }
            break;
            default:
                System.out.println("Enter error sign");
                break;
        }
    }
}
