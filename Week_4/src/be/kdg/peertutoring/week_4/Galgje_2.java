package be.kdg.peertutoring.week_4;

import java.util.Scanner;

public class Galgje_2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String teRadenWoord;

        do{
            System.out.println("Geef een woord (max 10 letters): ");
            teRadenWoord=kb.nextLine();
        }while (teRadenWoord.length()>10 || teRadenWoord.length()<5);
        for (int i =0;i<20;i++){
            System.out.println();
        }
        StringBuilder sbGuess = new StringBuilder();
        for (int i = 0; i < teRadenWoord.length(); i++) {
            sbGuess.append(".");
        }

        System.out.println("Het te zoeken woord: " + sbGuess);
        System.out.println("Doe een gok: ");
        char gok = kb.nextLine().charAt(0);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < teRadenWoord.length(); j++) {
                if(teRadenWoord.charAt(j)==gok){
                    sbGuess.setCharAt(j,gok);
                }
            }
            if(sbGuess.toString().equalsIgnoreCase(teRadenWoord)){
                System.out.println("Profictiat, je hebt het woord " + sbGuess.toString() + " geraden in " + i + " beurten!");
                System.exit(0);
            } else if(!sbGuess.toString().equalsIgnoreCase(teRadenWoord)){
                System.out.println("Het te zoeken woord: " + sbGuess);
                System.out.print("Doe nog een gok: ");
                gok= kb.nextLine().charAt(0);
            }
        }
    }
}
