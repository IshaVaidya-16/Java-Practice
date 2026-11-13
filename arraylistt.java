import java.util.*;
class arrayList
    {
        ArrayList<String> students = new ArrayList<String>();
        public void take()
        {
        Scanner sc=new Scanner(System.in);
            System.out.println("enter n:");
            int n=sc.nextInt();
            sc.nextLine();
            for(int i=0;i<n;i++)
                {
                    System.out.println("Enter name:");
                    String name=sc.nextLine();
                    students.add(name);
                }
            students.add(1,"kiki");
            cccc
            System.out.println(students.get(1));
            System.out.println(students.size());
            for(int i=0;i<students.size();i++)
                {
                    System.out.println(students.get(i));
                }
            for(String i:students)
                {
                    System.out.println(i);
                }
            Collections.sort(students);
            System.out.println(students);
}
    }
    public class arraylistt {
    public static void main(String[] args)
        {
        arrayList al=new arrayList();
        al.take();
        }
    
    }