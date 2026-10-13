import java.util.*;
class Employee
{
    String name;
    int id;
    public void displayEmployee()
    {
        System.out.println("name: "+name+"id: "+id);
    }
}
class inheritance extends Employee
{
    Employee emp=new Employee();
    double salary;
    void displaySalary()
    {
        System.out.println("salary: "+salary);
    }
    public static void main(String[] args)
    {
        inheritance m1=new inheritance();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name:");
        m1.name=sc.nextLine();
        System.out.println("enter salary");
        m1.salary=sc.nextDouble();
        System.out.println("enter id:");
        m1.id=sc.nextInt();
        m1.displayEmployee();
        m1.displaySalary();
    }
}