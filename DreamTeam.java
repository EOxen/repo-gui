/**
 * Java Core. Homework 1.
 *
 * @author Elena Oxenhorn
 * @version 17.10.2021
 */

public class DreamTeam {
    public static void main(String[] args) {
        Course course = new Course(1000, 1, 100);
        Team[] teams = {
            new Team("John", 1500, 3, 500, false),
            new Team("Ilona", 1300, 2, 100, false),
            new Team("Thomas", 500, 3, 200, false),
            new Team("Alisa", 1000, 1, 50, false),
        };
        course.info();
        System.out.println();
        for (Team team : teams) {
            team.setTeamName("Dream");
            System.out.println("Team " + team.getTeamName() + " , members: ");
            break;
        }
        for (Team team : teams) {
            System.out.println(team);
        }
        System.out.println();
        for (Team team : teams) {
            team.distancePassed(course);
            team.info();
        }
    }
}
