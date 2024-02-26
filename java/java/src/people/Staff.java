package people;

public class Staff extends Employee  {
    private String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress,
                 String office, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "title='" + title + '\'' +super.toString();
    }
}
