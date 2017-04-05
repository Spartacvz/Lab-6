package com.Greg;

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
}

    class ITECCourse {

        //Data that an ITECCourse object needs to store
        private String name;
        private int code;
        private ArrayList<String> student;
        private int maxStudents;

        private String room;

        ITECCourse(String courseName, int courseCode, int courseMaxStudents) {
            this.name = courseName;
            this.code = courseCode;
            this.student = new ArrayList<String>();  //Set up the students list
            this.maxStudents = courseMaxStudents;
            this.room = null;
        }

        ITECCourse(String courseName, int courseCode, int courseMaxStudents, String room) {
            this.name = courseName;
            this.code = courseCode;
            this.student = new ArrayList<String>();  //Set up the students list
            this.maxStudents = courseMaxStudents;
            this.room = room;
        }



        void addStudent(String studentName) {
            //No need to create ArrayList, the constructor has already done it

            //Check to see if the course is full before adding new student
            if (student.size() == maxStudents) {
                System.out.println("Course is full – can't add " + studentName);
                System.out.println("The maximum number of students is " + maxStudents);

            } else {
                student.add(studentName);
            }
        }


        void removeStudent(String studentName) {
            if (student.contains(studentName)) {
                student.remove(studentName);
                System.out.println(studentName + " was un-enrolled from " + this.name);
            } else {
                System.out.println(studentName + " was not found in " + this.name);
            }
        }


        //Rest of ITECCourse follows...


        void writeCourseInfo() {
            System.out.println("Course Name: " + name);
            System.out.println("Course Code: " + code);
            System.out.println("Students enrolled:");
            for (String student : student) {
                System.out.println(student);
            }
            System.out.println("There are " + getNumberOfStudents() + " students enrolled");
            System.out.println("The max number of students for this course is " + maxStudents);
            System.out.println("There are " + getFreeSpaces() + " spaces left");
        }

        int getNumberOfStudents() {
            return this.student.size();
        }


        int getFreeSpaces() {
            return maxStudents - getNumberOfStudents();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public int getMaxStudents() {
            return maxStudents;
        }

        public void setMaxStudents(int maxStudents) {
            this.maxStudents = maxStudents;
        }

        public String getRoom() {
            return room;
        }

        public void setRoom(String room) {
            this.room = room;
        }
    }