import java.util.Scanner;

public class University {
    private int numberOfStudent;
    public University(){
        this.numberOfStudent = 1000;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }
    public void enrollStudent(){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Student " + name + " was enrolled to the university.");
        this.numberOfStudent += 1;
    }
    public void kickStudent(){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Student " + name + " was kicked from the university.");
        this.numberOfStudent -= 1;
    }
    public void changeStudentBirthdate(){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String birthdate = sc.nextLine();
        System.out.println("Birthdate of student " + name + " was successfully changed to the " + birthdate);
    }
    public void findStudentsWithName(){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Here the surnames of students which name is " + name);
        System.out.println("Elzhanov");
        System.out.println("Alzhanov");
        System.out.println("Ilzhanov");
    }
}
