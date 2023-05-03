package Class14HW;



    /*
Create a Class called SyntaxEmployee:
Create three  variables  empID , salary and set the CEO to “Sumair”
Create two objects of the class SyntaxEmployee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects
 */



// Create a Class called SyntaxEmployee
public class SyntaxEmployee {

    //Create three  variables  empID , salary and set the CEO to “Sumair”
        int empID;
        double salary;
        String CEO = "Sumair";

        public static void main(String[] args) {
            // Create two objects of the SyntaxEmployee class
            SyntaxEmployee employee1 = new SyntaxEmployee();
            SyntaxEmployee employee2 = new SyntaxEmployee();

            // Set the value of empID and salary for employee1
            employee1.empID = 1001;
            employee1.salary = 50000;

            // Set the value of empID and salary for employee2
            employee2.empID = 1002;
            employee2.salary = 60000;

            // Print the values of empID, salary and CEO for each employee
            System.out.println("Employee 1: ID " + employee1.empID + ", salary " + employee1.salary + ", CEO " + employee1.CEO);
            System.out.println("Employee 2: ID " + employee2.empID + ", salary " + employee2.salary + ", CEO " + employee2.CEO);
        }
    }





