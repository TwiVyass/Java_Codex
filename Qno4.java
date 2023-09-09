import java.util.Scanner;
class Spy
{
    public static void main(String[] args)
  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int n = num;
        int sum = 0;
        int product = 1;

        while (num > 0) 
        {
            int digit = num % 10;
            sum = sum + digit;
            product = product * digit;
            num = num/10;
        }

        if (sum == product) 
        {
            System.out.println(n + " is a Spy Number.");
        } 
        else 
        {
            System.out.println(n + " is not a Spy Number.");
        }

    }
}
