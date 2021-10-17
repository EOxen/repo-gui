/**
 * Java Core. Homework 1.
 *
 * @author Elena Oxenhorn
 * @version 17.10.2021
 */

public class Team {
    private String tName = "DREAM";
    private String name;
    private int runLimit;
    private int longJumpLimit;
    private int swimLimit;
    boolean successfully;

    public Team(String name, int runLimit, int longJumpLimit,int swimLimit, boolean successfully) {
        this.name = name;
        this.runLimit = runLimit;
        this.longJumpLimit = longJumpLimit;
        this.swimLimit = swimLimit;
        successfully = successfully;
    }

    public String getTeamName() {
        return tName;
    }

    public void info() {
        if (successfully == true) {
            System.out.println(name + " Successfully completed the distance");
        }
    }

    public void distancePassed(Course c) {
        if (successfully != true) {
            successfully = c.distance(runLimit, longJumpLimit, swimLimit);
        }
    }

    @Override
    public String toString() {
        return name + " run: " + runLimit + ", long jump: " + longJumpLimit + ", swim: " + swimLimit;
    }
}