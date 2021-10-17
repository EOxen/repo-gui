/**
 * Java Core. Homework 1.
 *
 * @author Elena Oxenhorn
 * @version 17.10.2021
 */


public class Course {
    private int runDistance;
    private int longJumpDistance;
    private int swimDistanse;

    public Course(int runDistance, int longJumpDistance, int swimDistanse) {
        this.runDistance = runDistance;
        this.longJumpDistance = longJumpDistance;
        this.swimDistanse = swimDistanse;
    }

    public boolean distance(int r, int j, int s) {
        if(r < runDistance || j < longJumpDistance || s < swimDistanse) {
            return false;
        }
        return true;
    }

    public void info() {
        System.out.println("Obstacle course:");
        System.out.println("Run: " + runDistance + ", long jamp: " + longJumpDistance + ", swim: " + swimDistanse);
    }
}