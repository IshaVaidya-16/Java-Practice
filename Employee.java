import java.util.*;
public class Employee
{
    private String name;
    private int age;
    protected double salary;
    static String company;
    final int empid;

    public Employee()
    {
        name="abc";
        age=0;
        salary=0.0;
        empid=0;
        company="xyz";
    }
    
    public void display()
    {
        System.out.println("name:"+name+"\nage:"+age+"\nsalary:"+salary+"\ncompany:"+company+"\nempid:"+empid);
    }

    public static void main(String[] args)
    {
        Employee obj=new Employee();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
        obj.name=sc.nextLine();
        System.out.println("enter age");
        obj.age=sc.nextInt();
        System.out.println("enter salary");
        obj.salary=sc.nextDouble();

        obj.display();
        System.out.println(obj.age);
    }
}

