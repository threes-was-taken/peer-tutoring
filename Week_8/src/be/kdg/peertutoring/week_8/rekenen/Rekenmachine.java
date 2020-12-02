/* Dries created on 2/12/2020 inside the package - be.kdg.peertutoring.week_8.rekenen */
package be.kdg.peertutoring.week_8.rekenen;

import be.kdg.peertutoring.week_8.rekenen.plugins.Plugin;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Rekenmachine {
    private final int MAX_AANTAL_PLUGINS = 10;
    private Plugin[] ingeladenPlugins;
    private int aantalPlugins;
    private StringBuilder log;

    public Rekenmachine() {
        this.ingeladenPlugins = new Plugin[MAX_AANTAL_PLUGINS];
        aantalPlugins = 0;
        log = new StringBuilder();
    }

    public void installeer(Plugin teInstallerenPlugin) {
        //Opgave 2.1.a
        boolean mag = true;

        if (aantalPlugins >= MAX_AANTAL_PLUGINS){
            System.out.println("Max aantal plugins berijkt.");
        } else {
            for (int i = 0; i < aantalPlugins; i++) {
                if (ingeladenPlugins[i].getCommand().equals(teInstallerenPlugin.getCommand())) {
                    System.out.println("Plugin is al geinstalleerd.");
                    mag = false;
                }
            }
            if (mag){
                ingeladenPlugins[aantalPlugins] = teInstallerenPlugin;
                aantalPlugins++;
            }
        }
    }

    public double bereken(String command, double x, double y) {
        //Opgave 2.1.b
        for (int i = 0; i < aantalPlugins; i++) {
            if (ingeladenPlugins[i].getCommand().equals(command)){
                SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                var date = new Date();
                log.append(String.format("[%s] %f %s %f = %f\n", formatter.format(date), x, ingeladenPlugins[i].getCommand(), y, ingeladenPlugins[i].bereken(x, y)));
                return ingeladenPlugins[i].bereken(x, y);
            }
        }
        System.out.println("Plugin is niet geinstalleerd.");
        return 0;
    }

    @Override
    public String toString() {
        //Opgave 2.1c
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < aantalPlugins; i++) {
            sb.append(ingeladenPlugins[i].getCommand());
            sb.append(" ");
        }
        return "Geïnstalleerde plugins: "+sb.toString();
    }

    public String getLog() {
        return "==== LOG ====\n"+log.toString();
    }
}
