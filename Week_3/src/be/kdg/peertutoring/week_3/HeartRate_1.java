package be.kdg.peertutoring.week_3;

import java.util.Scanner;

public class HeartRate_1 {
    private static Scanner s;
    private static final double INCREASE = 0.1;

    public static void countdown() {
        System.out.println("Ga even zitten en adem 10x diep in en uit\nIndien je klaar bent typ ok");
        String go = s.next();
        if (go.equals("ok")) {
            System.out.println("Start");
            try {
                for (int i = 15; i >= 0; i--) {
                    if (i == 0) {
                        System.out.println("stop");
                        break;
                    }
                    System.out.print(i + "-");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }

    public static void calcLimits(int hrr, int rustslag, double minLimit, double maxLimit){
        double min = Math.round(hrr * minLimit + rustslag);
        double max = Math.round(hrr * maxLimit + rustslag);
        System.out.printf("Limieten hartslag: tussen %.0f en %.0f", min, max);
    }

    public static void main(String[] args) {
        System.out.println("Ken je je HRR?[J/N]");
        s = new Scanner(System.in);
        String antwoord = s.next();
        int hrr = 0;
        int rustslag = 0;
        int maxSlag = 0;


        if (antwoord.equals("J") || antwoord.equals("j")) {
            System.out.println("Geef je HRR in: ");
            hrr = s.nextInt();
            System.out.println("Kent u uw rustslag?[J/N]");
            antwoord = s.nextLine();
            if (antwoord.equals("J") || antwoord.equals("j")){
                System.out.println("Wat is je hartslag in rust?");
                rustslag = s.nextInt();
            }
        } else {
            countdown();
            System.out.println("Geef het aantal slagen in:");
            int aantalSlagen = s.nextInt();
            rustslag = aantalSlagen * 4;

            System.out.println("We gaan nu de maximale hartslag berekenen");
            for (int i = 1; true; i++) {
                if (i == 3) {
                    System.out.printf("Interval %d: Ren 60 seconden op volle snelheid.\n", i);
                    break;
                }
                System.out.printf("Interval %d: ren 30 seconden op volle snelheid\n", i);
                System.out.printf("Herstelperiode %d: Rust 60 seconden.\n", i);
            }
            countdown();
            System.out.println("Geef het aantal slagen in:");
            aantalSlagen = s.nextInt();
            maxSlag = aantalSlagen * 4;

            hrr = maxSlag - rustslag;
        }
        System.out.println("Uw HRR is: " + hrr);

        System.out.println("In welke zone wilt u trainen?");
        int zone = s.nextInt();

        double min = 0;
        double max = 0;

        switch (zone){
            case 1:
                min = 0.5;
                max = 0.6;
                calcLimits(hrr, rustslag, min, max);
                break;
            case 2:
                min = 0.6;
                max = 0.7;
                calcLimits(hrr, rustslag, min, max);
                break;
            case 3:
                min = 0.7;
                max = 0.8;
                calcLimits(hrr, rustslag, min, max);
                break;
            case 4:
                min = 0.8;
                max = 0.9;
                calcLimits(hrr, rustslag, min, max);
                break;
            case 5:
                min = 0.9;
                max = 1.0;
                calcLimits(hrr, rustslag, min, max);
                break;
        }

        //Deel 2

        while (!antwoord.equals("G") && !antwoord.equals("B")){
            System.out.println("Bent u beginner of gevorderde?");
            antwoord = s.next();
        }

        String ster = "*";
        String streep = "-";

        System.out.println("De hoeveelste dag voert u dit uit?");
        int ant = s.nextInt();
        int aantalExtra = ant/10;
        double onder = 0;
        double boven = 0;

        if (antwoord.equals("B")){
            onder = (hrr*0.7)+rustslag;
            boven = (hrr*0.9)+rustslag;
            System.out.println("Beginner dag "+ant+": ");
            System.out.printf("1. Loop tss %d en %d: %s\n", (int)onder, (int)boven, ster.repeat(10+(aantalExtra)*10));
            onder = (hrr*0.9)+rustslag;
            boven = hrr+rustslag;
            System.out.printf("2. Loop tss %d en %d: %s\n", (int)onder, (int)boven, streep.repeat(20+(aantalExtra)*20));
            boven = (hrr*0.7)+rustslag;
            System.out.printf("3. Wandel tot maximale hartslag %d.\n", (int)boven);
            onder = (hrr*0.5)+rustslag;
            boven = (hrr*0.7)+rustslag;
            System.out.printf("4. Wandel tss %d en %d: %s\n", (int)onder, (int)boven, streep.repeat(40+(aantalExtra)*40));
            onder = (hrr*0.6)+rustslag;
            boven = (hrr*0.7)+rustslag;
            System.out.printf("5. Wandel tss %d en %d: %s\n", (int)onder, (int)boven, ster.repeat(10+(aantalExtra)*10));
        } else {
            onder = (hrr*0.7)+rustslag;
            boven = (hrr*0.9)+rustslag;
            System.out.println("Beginner dag "+ant+": ");
            System.out.printf("1. Loop tss %d en %d: %s\n", (int)onder, (int)boven, ster.repeat(20+(aantalExtra)*20));
            onder = (hrr*0.9)+rustslag;
            boven = hrr+rustslag;
            System.out.printf("2. Loop tss %d en %d: %s\n", (int)onder, (int)boven, streep.repeat(30+(aantalExtra)*30));
            boven = (hrr*0.7)+rustslag;
            System.out.printf("3. Wandel tot maximale hartslag %d.\n", (int)boven);
            onder = (hrr*0.5)+rustslag;
            boven = (hrr*0.7)+rustslag;
            System.out.printf("4. Wandel tss %d en %d: %s\n", (int)onder, (int)boven, streep.repeat(40+(aantalExtra)*40));
            onder = (hrr*0.6)+rustslag;
            boven = (hrr*0.7)+rustslag;
            System.out.printf("5. Wandel tss %d en %d: %s\n", (int)onder, (int)boven, ster.repeat(10+(aantalExtra)*10));
        }

    }
}

