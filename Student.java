public class Student {
    // Fields (attributes)
    String name;
    int rollNumber;
    double marks;

    // Constructor (to set values when object is created)
    Student(String n, int r, double m) {
        name = n;
        rollNumber = r;
        marks = m;
    }

    // Method to display student information
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }

    // Method to calculate grade based on marks
    void calculateGrade() {
        if (marks >= 90)
            System.out.println("Grade: A");
        else if (marks >= 75)
            System.out.println("Grade: B");
        else if (marks >= 50)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: Fail");
    }

    // Main method — program starts here
    public static void main(String[] args) {
        // Create first student object
        Student s1 = new Student("Anu", 101, 86.5);
        s1.displayInfo();
        s1.calculateGrade();

        System.out.println(); // for spacing

        // Create second student object
        Student s2 = new Student("Ravi", 102, 45.0);
        s2.displayInfo();
        s2.calculateGrade();
    }
}
