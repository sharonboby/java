package tutorial7;
import java.util.Scanner;
class employee {
    String name,address;
    int age,mob;
    float sal;
    void print_Salary() {
        System.out.println("Salary: " + sal);
    }
}
class officer extends employee {
    String spl;
    void print_Specialization() {
        System.out.println("Specialization: " + spl);
    }
}
class manager extends employee {
    String dep;
    void print_Dept() {
        System.out.println("Department: " + dep);
    }
}
public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        officer o = new officer();
        System.out.print("Enter Officer's Name: ");
        o.name = sc.nextLine();
        System.out.print("Enter Address: ");
        o.address = sc.nextLine();
        System.out.print("Enter Age: ");
        o.age = sc.nextInt();
        System.out.print("Enter Mobile: ");
        o.mob = sc.nextInt();
        System.out.print("Enter Salary: ");
        o.sal = sc.nextFloat();
        sc.nextLine();
        System.out.print("Enter Specialization: ");
        o.spl = sc.nextLine();
        manager m = new manager();
        System.out.print("Enter Manager's Name: ");
        m.name = sc.nextLine();
        System.out.print("Enter Address: ");
        m.address = sc.nextLine();
        System.out.print("Enter Age: ");
        m.age = sc.nextInt();
        System.out.print("Enter Mobile: ");
        m.mob = sc.nextInt();
        System.out.print("Enter Salary: ");
        m.sal = sc.nextFloat();
        sc.nextLine();
        System.out.print("Enter Department: ");
        m.dep = sc.nextLine();
        System.out.println("\n--- Officer Details ---");
        System.out.println("Name: " + o.name);
        System.out.println("Address: " + o.address);
        System.out.println("Age: " + o.age);
        System.out.println("Mobile: " + o.mob);
        o.print_Salary();
        o.print_Specialization();
        System.out.println("\n--- Manager Details ---");
        System.out.println("Name: " + m.name);
        System.out.println("Address: " + m.address);
        System.out.println("Age: " + m.age);
        System.out.println("Mobile: " + m.mob);
        m.print_Salary();
        m.print_Dept();
        sc.close();
    }
}