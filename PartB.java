import java.io.*;
class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private int studentID;
    private String name;
    private String grade;

    public Student(int studentID, String name, String grade) {
        this.studentID = studentID;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentID + ", Name: " + name + ", Grade: " + grade;
    }
}

public class PartB {
    public static void main(String[] args) {
        String filename = "student.ser";
        Student s1 = new Student(101, "Mudit", "A");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(s1);
            System.out.println("Serialized: " + s1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Student s2 = (Student) ois.readObject();
            System.out.println("Deserialized: " + s2);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
