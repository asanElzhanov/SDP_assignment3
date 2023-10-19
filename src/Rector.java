public class Rector {
    public static void main(String[] args) {
        University university = new University();
        Database studentDatabase = new AdapterUniversityToDatabase(university);
        int numBeforeDeleting = university.getNumberOfStudent();
        studentDatabase.delete();
        System.out.println("Number of students before deleting from university: " + numBeforeDeleting);
        System.out.println("Number of students after deleting from university: " + university.getNumberOfStudent());
        studentDatabase.insert();
        studentDatabase.select();
        studentDatabase.update();
    }
}