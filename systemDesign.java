import java.util.Scanner;
import java.util.logging.Logger;

public class systemDesign{
    WriteNew writeNew = new WriteNew();
    
    public void startGame(String underScores) {
        Scanner scanner = new Scanner(System.in);
        final Logger logger = Logger.getLogger(Main.class.getName());
        writeNew.write("Start game?(Y/N)");
        String command = scanner.nextLine();
        if (command.equals("N") ) {
        } else {
            int match = 4;
            int life = 5;
            while (life != 0) {
                life -= 1;
                System.out.println(underScores);
                scanner.nextLine();
            } scanner.close(); 
        } 
    }
    public String undersCorePrinter(String word){
        StringBuilder result = StringBuilder();
        System.out.println(word.length());
        for (int i = 0; i < word.length(); i++){
            result.append("_ ");
        }
        return result;
    }
}