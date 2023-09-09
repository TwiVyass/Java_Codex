import java.util.Scanner;

class SumOfDigits 
{
    public static void main(String[] args) 
  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        int sum = 0;
        int n = num;

        while (num > 0) 
        {
            int digit = num % 10;
            sum = sum + digit;
            num = num/10;
        }

        System.out.println("Sum of digits of " + n + " is " + sum);
    }
}
