/* Dries created on 2/12/2020 inside the package - be.kdg.peertutoring.week_8.rekenen.plugins */
package be.kdg.peertutoring.week_8.rekenen.plugins;

public class Percentage implements Plugin{
    @Override
    public String getCommand() {
        return "%";
    }

    @Override
    public double bereken(double x, double y) {
        return x - (x * (y / 100));
    }
}
