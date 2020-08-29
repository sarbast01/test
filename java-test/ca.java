import java.util.*;
public class ca {
  public static void main(String[] args) {
    Scanner sa = new Scanner(System.in);
    System.out.print("inter first number : ");
    int num1 = sa.nextInt();
    System.out.print("inter second number : ");
    int num2 = sa.nextInt();
    System.out.print("inter oprater  : ");
    Scanner s = new Scanner(System.in);
    char op = s.next().charAt(0);
    switch (op) {
      case '+':
        int sum = num1 + num2;
        System.out.println("num1 + num2 = " + sum);
        break ;
      case '-':
        int min = num1 - num2;
        System.out.println("num1 - num2 = " + min);
        break ;
        case '*':
        int mul = num1 * num2;
        System.out.println("num1  * num2 = " + mul);
        break ;
        case '/':
        float dev = num1 + num2;
        System.out.println("num1 / num2 = " + dev);
        break ;
      default:
        System.out.println("you have entwered  wrong");
        break ;  
      }
  }
}