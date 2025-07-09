// File: College.java
package student101;

public class College {
    private Student student;

    public void setStudent(Student student) {
        this.student = student;
    }

    public void showDetails() {
        System.out.println("College Info:");
        student.display();
    }
}
