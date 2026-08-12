package tutorial7;
import java.util.Scanner;
class Students {
    String name,course;
    int rollNo;
    void setDetails(String name,int rollNo,String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}
class StudentAccount extends Students {
    double collegeFee;
    void setCollegeFee(double collegeFee) {
        this.collegeFee = collegeFee;
    }
    void displayCollegeFee() {
        System.out.println("College Fee: " + collegeFee);
    }
}
class Hosteller extends StudentAccount {
    double hostelFee,messFee;
    void setFees(double hostelFee,double messFee) {
        this.hostelFee = hostelFee;
        this.messFee = messFee;
    }
    void displayAll() {
        displayDetails();
        displayCollegeFee();
        System.out.println("Hostel Fee: " + hostelFee);
        System.out.println("Mess Fee: " + messFee);
        System.out.println("Total Fee: " + (collegeFee + hostelFee + messFee));
    }
}
class DayScholar extends StudentAccount {
    double busFee;
    void setBusFee(double busFee) {
        this.busFee = busFee;
    }
    void displayAll() {
        displayDetails();
        displayCollegeFee();
        System.out.println("Bus Fee: " + busFee);
        System.out.println("Total Fee: " + (collegeFee + busFee));
    }
}
public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hosteller h = new Hosteller();
        System.out.print("Enter Hosteller's Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Course: ");
        String course = sc.nextLine();
        System.out.print("Enter College Fee: ");
        double collegeFee = sc.nextDouble();
        System.out.print("Enter Hostel Fee: ");
        double hostelFee = sc.nextDouble();
        System.out.print("Enter Mess Fee: ");
        double messFee = sc.nextDouble();
        h.setDetails(name,rollNo,course);
        h.setCollegeFee(collegeFee);
        h.setFees(hostelFee,messFee);
        sc.nextLine();
        DayScholar d = new DayScholar();
        System.out.print("Enter Day Scholar's Name: ");
        name = sc.nextLine();
        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Course: ");
        course = sc.nextLine();
        System.out.print("Enter College Fee: ");
        collegeFee = sc.nextDouble();
        System.out.print("Enter Bus Fee: ");
        double busFee = sc.nextDouble();
        d.setDetails(name,rollNo,course);
        d.setCollegeFee(collegeFee);
        d.setBusFee(busFee);
        System.out.println("\n--- HOSTELLER DETAILS ---");
        h.displayAll();
        System.out.println("\n--- DAY SCHOLAR DETAILS ---");
        d.displayAll();
        sc.close();
    }
}