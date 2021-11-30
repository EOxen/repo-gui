import java.util.Arrays;

public class Student {
    String name;
    String arrCourse[];

    public Student(String name, String[] arrCourse) {
        this.name = name;
        this.arrCourse = arrCourse;
    }

    @Override
    public String toString(){
        String str = Arrays.toString(arrCourse)
                .replace("[", "")
                .replace("]", "")
                .trim();
        return name + "'s courses: " + str;
    }

    public String getName() {
        return name;
    }

    public String getArrCourse() {
        String str = Arrays.toString(arrCourse)
                .replace("[", "")
                .replace("]", "")
                .trim();
        return str;
    }

    public int countCourse(){
        return arrCourse.length;
    }
}

