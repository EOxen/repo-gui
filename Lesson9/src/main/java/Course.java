import java.util.Arrays;

public class Course {
    String courseName[];

    public Course(String[] courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString(){
        String str = Arrays.toString(courseName);
        return str;
    }
}