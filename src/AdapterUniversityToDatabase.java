import java.util.Scanner;

public class AdapterUniversityToDatabase implements Database{
    University university;
    public AdapterUniversityToDatabase(University university){
        this.university = university;
    }
    @Override
    public void insert() {
        university.enrollStudent();
    }

    @Override
    public void update() {
        university.changeStudentBirthdate();
    }

    @Override
    public void select() {
        university.findStudentsWithName();
    }

    @Override
    public void delete() {
        university.kickStudent();
    }
}
