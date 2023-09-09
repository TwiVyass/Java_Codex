import java.util.Scanner;

class Reverse 
{
  public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter string:");
        String str = sc.nextLine();
        String reversedStr = ""; 

        for (int i = 0; i < str.length(); i++) 
        {
            reversedStr = str.charAt(i) + reversedStr;
        }

        System.out.println("Reversed string: " + reversedStr);
    }
}
