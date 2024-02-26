import people.Faculty;
import people.MyDate;

public class Main {
    public static void main(String[] args) {
        MyDate hireDate = new MyDate(2024, 2, 26);
        Faculty facultyMember = new Faculty("subhadip pahari", "3320 Topaz Ln", "111-222", "subhadip1203dev@gmail.com",
                "Office1", 90000, hireDate, "Monday 3-5 PM", "Professor");

        System.out.println(facultyMember);
    }
}
