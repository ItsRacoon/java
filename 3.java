import java.util.Scanner;
class  Employee {
    String empId;
    String empName;
    long empPhone;
    float empSalary;
    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Staff Id: ");
        empId = scanner.next();
        System.out.print("Enter Name: ");
        empName = scanner.next();
        System.out.print("Enter Phone: ");
        empPhone = scanner.nextLong();
        System.out.print("Enter Salary: ");
        empSalary = scanner.nextFloat();
    }
    public void display() {
        System.out.println("Staff Id: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Phone: " + empPhone);
        System.out.println("Salary: " + empSalary);
    }
}
class Teaching extends Employee {
    String domain;
    int n;
    public void accept() {
        super.accept();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Domain: ");
        domain = scanner.next();
        System.out.print("Enter Number of Publications: ");
        n = scanner.nextInt();
        System.out.println("\n");
    }
    public void display() {
        super.display();
        System.out.println("Domain: " + domain);
        System.out.println("Publications:" + n);
        System.out.println("\n");
    }
}
class Technical extends Employee {
    String skill;
    public void accept() {
        super.accept();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter technical Skills: ");
        skill = scanner.nextLine();
        System.out.println("\n");
    }
    public void display() {
        super.display();
        System.out.println("Technical Skills: " + skill);
        System.out.println("\n");
    }
}
class Contract extends Employee {
    int period;
    public void accept() {
        super.accept();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Period: ");
        period = scanner.nextInt();
        System.out.println("\n");
    }
    public void display() {
        super.display();
        System.out.println("Contract Period: " + period);
    }
}
class EmployeeFour {
    public static void main(String[] args) {
        Teaching teaching = new Teaching();
        System.out.println("Enter the details of Teaching Staff");
        teaching.accept();
        Technical technical = new Technical();
        System.out.println("Enter the details of Technical Staff");
        technical.accept();
        Contract contract = new Contract();
        System.out.println("Enter the details of Contract Staff");
        contract.accept();
        System.out.println("The details of Teaching Staff");
        teaching.display();
        System.out.println("The details of Technical Staff");
        technical.display();
        System.out.println("The details of Contract Staff");
        contract.display();
    }
}
