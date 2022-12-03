/*
 * it is not normal calculator if you see there it use of switch but not easy 
 */
import java.util.Scanner;

public class project5 {
    public void Calculator(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter  number : ");

        while (true) {
            
            // twist is here only ..!
            float num1 = input.nextInt();
            // 1
            char Choose = input.next().charAt(0);
            // 2
            float num2 = input.nextInt();

        
        switch (Choose) {
            case '+':
            System.out.println("=> "+(num1+num2)); 
            break;
            case '-':
                if (num1>=num2) {
                    System.out.println("=> "+(num1-num2));
                }else{
                    System.out.println("please enter first number greater and equal then second number");
                }
                break;
            case '*':
            System.out.println("=> "+(num1*num2)); 
            break;
            case '/':
            if (num1>=num2) {
                System.out.println("=> "+(num1/num2));
            }else{
                System.out.println("please enter first number greater and equal then second number");
            }
            break;
            default:
            System.out.println("Enter error sign");
            break;
            }
        }
    }
        public static void main(String[] args) {
            
        project5 cal = new project5();
        cal.Calculator();
    }
}
