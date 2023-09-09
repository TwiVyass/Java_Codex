import java.util.Scanner;

class NumberTable
{
    public static void main(String[] args) 
  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) 
        {
            int product = num * i;
            System.out.println(num + " X " + i + " = " + product);
        }

        
    }
}
