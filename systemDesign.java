import java.util.Scanner;

public class systemDesign{
    public void system() {
        WriteNew writeNew = new WriteNew();
        Scanner scanner = new Scanner(System.in);
        writeNew.write("What your command sir?");
        String userInput = scanner.nextLine();
        writeNew.write("your command is: " + userInput);
        scanner.close();
    }
}