import java.util.*;

class Student
{
    public String name;
    public int age;
    public double marks;
    Student()
    {
        name="abc";
        age=0;
        marks=0.0;

    }
    public Student(String n,int a,double m)
    {
        this.name=n;
        this.age=a;
        this.marks=m;
    }
    public void display()
    {
        System.out.println("name:"+name+"\nage:"+age+"\nmarks:"+marks);
    }
}

class constructors
{    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
        String name=sc.nextLine();
        System.out.println("enter age");
        int age=sc.nextInt();
        System.out.println("enter marks");
        double marks=sc.nextDouble();
        Student obj1=new Student();
        Student obj=new Student(name, age, marks);
        System.out.println("Default constructor values");
        obj1.display();
        System.out.println("Parameterized constructor values");
        obj.display();

    }
}