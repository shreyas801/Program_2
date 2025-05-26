import java.time.LocalDate;

class Student {
    String name;
    int age;
    LocalDate dob;

    public Student(String name, int age, String dob) {
        this.name = name;
        this.age = age;
        this.dob = LocalDate.parse(dob);
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Date of Birth: " + dob);
    }

    public static void main(String[] args) {
        Student student = new Student("Shreyas", 19, "2006-03-16");
        student.displayInfo();
    }
}