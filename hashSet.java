import java.util.*;
import java.io.*;

class bobby
    {
        HashSet<String> hs=new HashSet<String>();
        public void accept()
        {
            int n;
            String input;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter n:");
            n=sc.nextInt();
            sc.nextLine();
            for(int i=0;i<n;i++)
                {
                    System.out.println("enter cars name: ");
                    input=sc.nextLine();
                    hs.add(input);
                }
            System.out.println("HashSet is: ");
            System.out.println(hs);
        }
    }
public class hashSet {
    public static void main(String[] args)
    {
        bobby bb=new bobby();
        bb.accept();
    }
}
    
