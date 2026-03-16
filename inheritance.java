import java.util.Scanner;

class Emp {
    int empId;
    String name;
    double sal;

    Emp(int empId, String name, double sal) {
        this.empId = empId;
        this.name = name;
        this.sal = sal;
    }
}

class Teacher extends Emp {
    String dept;
    String sub;

    Teacher(int empId, String name, double sal, String dept, String sub) {
        super(empId, name, sal);  
        this.dept = dept;
        this.sub = sub;
    }
        void display(){    
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + sal);
        System.out.println("Department: " + dept);
        System.out.println("Subject Taught: " + sub);
        System.out.println("----------------------------");
    }
}

public class inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();  

        Teacher[] teachers = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Teacher " + (i + 1));

            System.out.print("Employee ID: ");
            int empId = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double sal = sc.nextDouble();
            sc.nextLine();

            System.out.print("Department: ");
            String dept = sc.nextLine();

            System.out.print("Subject Taught: ");
            String sub = sc.nextLine();

            teachers[i] = new Teacher(empId, name, sal, dept, sub);
        }

        System.out.println("\n--- Teacher Details ---");
        for (int i = 0; i < n; i++) {
            teachers[i].display();
        }

        sc.close();
    }
}
