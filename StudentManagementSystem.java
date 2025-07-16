import java.util.*;

public class StudentManagementSystem {

    // Arrays and Variables
    static String[] names = new String[100];
    static int[] ids = new int[100];
    static int[] marks = new int[100];
    static int count = 0;

    static Scanner ks = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Students Management System\n");

        while(true){
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search by ID");
            System.out.println("4. Delete Student");
            System.out.println("5. Calculate Grade");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = ks.nextInt();

            if(choice == 1){
                addStudent();
            } else if(choice == 2){
                viewStudents();
            } else if(choice == 3){
                searchStudent();
            } else if(choice == 4){
                deleteStudent();
            } else if(choice == 5){
                calculateGrade();
            } else if(choice == 6){
                exit();
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
            System.out.println(); 
        }
    }
    
       //add Student
       //view Students 
       //search Student
       //delete Student
       //calculate Grade
       //Exit
       
    static void addStudent(){
        System.out.print("Enter student name: ");
        names[count] = ks.next();

        System.out.print("Enter student ID: ");
        ids[count] = ks.nextInt();

        System.out.print("Enter marks: ");
        marks[count] = ks.nextInt();

        System.out.println("Student added successfully!");
        count++;
    }

    static void viewStudents(){
        if(count == 0){
            System.out.println("No students found.");
        } else {
            System.out.println("---- Student List ----");
            for(int i = 0; i < count; i++){
                System.out.println("ID: " + ids[i] + " | Name: " + names[i] + " | Marks: " + marks[i]);
            }
        }
    }

    static void searchStudent(){
        System.out.print("Enter ID to search: ");
        int searchId = ks.nextInt();
        boolean found = false;

        for(int i = 0; i < count; i++){
            if(ids[i] == searchId){
                System.out.println("Student found!");
                System.out.println("ID: " + ids[i]);
                System.out.println("Name: " + names[i]);
                System.out.println("Marks: " + marks[i]);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Student not found.");
        }
    }

    static void deleteStudent(){
        System.out.print("Enter ID to delete: ");
        int deleteId = ks.nextInt();
        boolean found = false;

        for(int i = 0; i < count; i++){
            if(ids[i] == deleteId){
                // Shift remaining data left
                for(int j = i; j < count - 1; j++){
                    ids[j] = ids[j + 1];
                    names[j] = names[j + 1];
                    marks[j] = marks[j + 1];
                }
                count--;
                System.out.println("Student deleted successfully.");
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Student with ID " + deleteId + " not found.");
        }
    }

    static void calculateGrade(){
        System.out.print("Enter ID to calculate grade: ");
        int gradeId = ks.nextInt();
        boolean found = false;

        for(int i = 0; i < count; i++){
            if(ids[i] == gradeId){
                int mark = marks[i];
                String grade;

                if(mark >= 90) grade = "O";
                else if(mark >= 70) grade = "A+";
                else if(mark >= 60) grade = "A";
                else if(mark >= 50) grade = "B";
                else if(mark >= 35) grade = "C";
                else grade = "Fail";

                System.out.println("Student Name: " + names[i]);
                System.out.println("Marks: " + mark);
                System.out.println("Grade: " + grade);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Student ID not found.");
        }
    }

    static void exit(){
        System.out.println("Exiting... Thank you!");
        System.exit(0); 
    }
}