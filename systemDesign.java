import java.util.logging.Logger;
import java.util.Scanner;

public class systemDesign {
    WriteNew writeNew = new WriteNew();

    public void startGame(String underScores) {
        Scanner scanner = new Scanner(System.in);
        writeNew.write("Start game?(Y/N)");
        String command = scanner.nextLine();
        if (command.equals("N")) {
        } else {
            int match = 4;
            int life = 10;
            while (life != 0) {
                life -= 1;
                writeNew.write(underScores);
                // scanner.nextLine();
                String letter = userLatter();
                if (isMatch("ahmad", letter)) {
                    match -= 1;
                }
                System.err.println(match);
            }
            scanner.close();
        }
    }

    public String undersCorePrinter(String word) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            result.append("_ ");
        }
        System.out.println(result);
        return result.toString();
    }

    public boolean isMatch(String word, String letter){
        // System.err.println(word.indexOf(letter));
        return word.indexOf(letter) != -1;




        
    }

    private String userLatter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a letter: ");
        String letter = scanner.nextLine();
        return letter;
    }

}