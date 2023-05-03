package Class14HW;


// Create a Class called Students
public class Students {

    //Create three  variables  Name , ID  and  numberOfStudents
    String Name;
    int ID;
    static int numberOfStudents = 0;
    // Constructor
    public Students(String studentName, int studentID) {
        Name = studentName;
        ID = studentID;
        numberOfStudents++;
    }

    public static void main(String[] args) {
        // Create three objects of the Students class
        Students student1 = new Students("Ilya", 1001);
        Students student2 = new Students("Vlad", 1002);
        Students student3 = new Students("Brett", 1003);
        Students student4 = new Students ("Amira",1004);

        // Print the total number of students
        System.out.println("Total number of students: " + numberOfStudents);
    }
}

