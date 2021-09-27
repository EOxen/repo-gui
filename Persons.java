/**
 * Java 1. Homework 5.
 *
 * @author Elena Oxenhorn
 * @version 27.09.2021
 */
class Employee {
    private String name;
    private String posotion;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String posotion, String email, String phone, int salary, int age) {
        this.name = name;
        this.posotion = posotion;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + ", " + posotion + ", " + email + ", " + phone + ", " + salary + ", " + age;
    }
}


class Persons {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Ivanov Ivan", "Engineer", "iivan@mailbox.com", "892312312", 30000, 30),
            new Employee("Alexandrov Alexandr", "Manager", "alalex@mailbox.com", "892323456", 25000, 35),
            new Employee("Semenov Semen", "Accountant", "semsem@mailbox.com", "892532154", 28000, 42),
            new Employee("Ivanova Irina", "Manager", "ivirina@mailbox.com", "892312313", 25000, 25),
            new Employee("Jegorov Jegor", "General Manager", "jegor@mailbox.com", "890010011", 50000, 45),
        };

        for (Employee employee : employees) 
            if (employee.getAge() > 40) 
                System.out.println(employee);
    }
}