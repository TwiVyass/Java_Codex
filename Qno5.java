import java.util.Scanner;

class WordAndLine 
{
    public static void main(String[] args) 
  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();
        System.out.println("Enter a line: ");
        String line = scanner.nextLine();

        System.out.println(word + " " + line);
    }
}
