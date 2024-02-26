import people.Faculty;
import people.MyDate;

public class Main {
    public static void main(String[] args) {
        MyDate hireDate = new MyDate(2023, 1, 15);
        Faculty facultyMember = new Faculty("John Doe", "123 Main St", "555-1234", "john.doe@email.com",
                "Office 101", 75000, hireDate, "Monday 3-5 PM", "Professor");

        System.out.println(facultyMember);
    }
}
