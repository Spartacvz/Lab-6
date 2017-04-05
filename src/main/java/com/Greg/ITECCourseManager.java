import java.util.ArrayList;

public class ITECCourseManager {

    public static void main(String[] args) {

        //Much less code!
        ITECCourse courseManager = new ITECCourse("Microcomputer Systems Maintenance", 1310, 20);

        // This is where I add students

        courseManager.addStudent("Anna");
        courseManager.addStudent("Bill");
        courseManager.addStudent("Carl");

        // This is where I remove students
        courseManager.removeStudent("Carl");

        courseManager.writeCourseInfo();

        ITECCourse DataComCourse = new ITECCourse("Data Communications", 1425, 30);

        DataComCourse.addStudent("Dave");
        DataComCourse.addStudent("Ed");
        DataComCourse.addStudent("Flora");

        DataComCourse.writeCourseInfo();


        //Test the add students method with an example class
        // This class has a max of 3 students
        ITECCourse smallCourse = new ITECCourse("Made up name small class", 1234, 3);
        smallCourse.addStudent("Jake");
        smallCourse.addStudent("Kirby");
        smallCourse.addStudent("Liam");
        //We shouldn't be able to add another student – what happens?
        smallCourse.addStudent("Marigold");

        ITECCourse concepts = new ITECCourse("Info Tech Concepts", 1100, 30, "T3050");
        concepts.addStudent("Max");
        concepts.addStudent("Nancy");
        concepts.addStudent("Orson");
        concepts.addStudent("Petra");


        ArrayList<ITECCourse> allCourses = new ArrayList<>();

        allCourses.add(DataComCourse);
        allCourses.add(courseManager);
        allCourses.add(smallCourse);
        allCourses.add(concepts);

        System.out.println("\nFree space report\n");

        for (ITECCourse course : allCourses) {
            System.out.println("Course name: " + course.getName() + " has " + course.getFreeSpaces() + " spaces left");
            ;
        }
    }

    private static class ITECCourse {
        // IECCourse class variables
        String name;
        int code;
        ArrayList<String> students;
        int maxStudents;

        public void addStudent(String anna) {
        }
    }

}
}