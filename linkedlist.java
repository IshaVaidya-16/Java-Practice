import java.util.*;

class linked{
    LinkedList<String> ll=new LinkedList<String>();
    int i,n;
    void accept()
    {
    System.out.println("enter n:");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    String ele;
        for(i=0;i<n;i++)
            {
                System.out.println("enter element:");
                ele=sc.next();
                ll.add(ele);
            }
        ll.addFirst("pankaj");
        ll.addLast("rahul");
        System.out.println(ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        Collections.sort(ll);
        System.out.println(ll);
        Collections.sort(ll,Collections.reverseOrder());
        System.out.println(ll);

    }}

    public class linkedlist {
        public static void main(String[] args)
        {
            linked li=new linked();
            li.accept();
            
        }
    }