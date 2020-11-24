package be.kdg.peertutoring.week_4;

import java.util.Scanner;

public class Galgje_3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        final String HANGMAN =
                "----- \n" +
                        "|   | \n" +
                        "|   O \n" +
                        "|  /|\\\n" +
                        "|   | \n" +
                        "|  / \\\n" +
                        "|     \n" +
                        "-------";

        String teRadenwoord;
        do {
            System.out.println("Geef een woord (max 10 letters): ");
            teRadenwoord = kb.nextLine();
        } while (teRadenwoord.length() > 10 || teRadenwoord.length() < 5);
        for (int i = 0; i < 20; i++) {
            System.out.println();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < teRadenwoord.length(); i++) {
            sb.append(".");
        }
        System.out.println("Het te zoeken woord: " + sb);
        System.out.print("Raad een letter: ");
        char gok = kb.nextLine().charAt(0);
        int posInHangman = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < teRadenwoord.length(); j++) {
                if (teRadenwoord.charAt(j) == gok) {
                    sb.setCharAt(j, gok);
                }
            }
            if (sb.toString().equalsIgnoreCase(teRadenwoord)) {
                System.out.println("Proficiat, je hebt het woord " + sb + " geraden in " + i + " beurten!");
                System.exit(0);
            } else if (!sb.toString().equalsIgnoreCase(teRadenwoord)) {
                System.out.println("Het te zoeken woord: " + sb);
                posInHangman += 7;
                String hangmanGetoond = HANGMAN.substring(0, posInHangman);
                System.out.println(hangmanGetoond);
                System.out.print("Raad een letter: ");
                gok = kb.nextLine().charAt(0);
            }
        }
    }
}
