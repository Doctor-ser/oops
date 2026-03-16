import java.util.Scanner;

class Employee {
    int e_no;
    String e_name;
    double salary;

    void readData(Scanner sc) {
        System.out.print("Enter Employee Number: ");
        e_no = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        e_name = sc.nextLine();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    void display() {
        System.out.println("Employee Number: " + e_no);
        System.out.println("Employee Name: " + e_name);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee[] emp = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));
            emp[i] = new Employee();
            emp[i].readData(sc);
        }

        System.out.print("\nEnter Employee Number to search: ");
        int searchNo = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (emp[i].e_no == searchNo) {
                System.out.println("\nEmployee Found");
                emp[i].display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nEmployee with e_no " + searchNo + " not found.");
        }

        sc.close();
    }
}

