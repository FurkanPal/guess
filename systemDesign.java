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
                boolean isMatch = isMatch("ahmad", letter);
                int indexOfMatch = indexOfMatch("ahmad", letter);
                if (isMatch) {
                    undersCorePrinter("ahmad", letter, isMatch, indexOfMatch);
                    match -= 1;
                }
                System.err.println(match);
            }
            scanner.close();
        }
    }

    public String undersCorePrinter(String word, String letter, boolean isMatch, int indexOfMatch) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            result.append("_ ");
        }
        // System.out.println(result);
        if (isMatch) {
                String stringresult = result.toString();
                String modifiedString = stringresult.substring(0, indexOfMatch * 2) + letter + stringresult.substring(indexOfMatch * 2 + 1);
                result = new StringBuilder(modifiedString);
                System.out.println(result.toString());
                return result.toString();    
        } else {return result.toString();}
    }


    // Cheking if match //

    public boolean isMatch(String word, String letter) {
        System.out.println(word.indexOf(letter));
        return word.indexOf(letter) != -1;
    }

    public int indexOfMatch(String word, String letter) {
        return word.indexOf(letter);
    }

    // Cheking if match //

    private String userLatter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a letter: ");
        String letter = scanner.nextLine();
        return letter;
    }
}