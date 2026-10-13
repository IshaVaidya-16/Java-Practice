
import java.util.Scanner;

class myinfo
{
    public String name,city;
    public int age;
    public void inputt()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        name=sc.nextLine();
        System.out.println("Enter city:");
        city=sc.nextLine();
        System.out.println("Enter your age");
        age=sc.nextInt();
    }
    public void display()
    {
        System.out.println("Name:"+name+
            "\nCity:"+city+"\nAge:"+age);
    }
}
class details {
   
    public static void main(String[] args) {
        myinfo obj=new myinfo();
        obj.inputt();
        obj.display();
    }
}
