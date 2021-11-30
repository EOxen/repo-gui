import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", new String[]{"english", "french", "biology", "chemistry"});
        Student student2 = new Student("Igor", new String[]{"english", "programming"});
        Student student3 = new Student("Victor", new String[]{"english", "german"});
        Student student4 = new Student("Irina", new String[]{"english", "french", "german"});
        Student student5 = new Student("Julia", new String[]{"french", "german", "biology", "chemistry"});

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        allStudent(students);
        System.out.println();
        uniqueCourses(students);
        System.out.println();
        inquisitiveStudents(students);
        System.out.println();
        studentAttendingCourse(students, "biology");
    }

    public static void allStudent(List<Student> l) {
        System.out.println("List of all students attending courses:");
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i).getName() + " attends courses: " + l.get(i).getArrCourse());
        }
    }

    public static void uniqueCourses (List<Student> l){
        List<String> streamCourse = l.stream()
                .map((s1) -> s1.getArrCourse())
                .collect(Collectors.toList());
        StringBuilder sb = new StringBuilder();
        for (String a : streamCourse) {
            sb.append(a);
            sb.append(", ");
        }
        String str = sb.toString();
        String delimiter = ", ";
        String strArray[] = str.split(delimiter);
        System.out.println("Unique courses attended:");
        System.out.println(Arrays.stream(strArray)
                .distinct()
                .collect(Collectors.joining(", ")));
    }

    public static void inquisitiveStudents (List<Student> l){
        System.out.println("The most inquisitive students:");
        System.out.println(l.stream()
                .sorted((s1, s2) -> s2.countCourse() - s1.countCourse())
                .map((s1) -> s1.name)
                .limit(3)
                .collect(Collectors.joining(", ")));
    }

    public static void studentAttendingCourse(List<Student> l, String s) {
        System.out.println("Students attending " + s + " course:");
        System.out.println(l.stream()
                .filter(s1 -> s1.getArrCourse().indexOf(s) != -1)
                .map((s1) -> s1.name)
                .limit(3)
                .collect(Collectors.joining(", ")));
    }
}
