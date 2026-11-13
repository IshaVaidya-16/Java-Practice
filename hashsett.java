import java.util.*;
class hashing
    {
        HashSet<Integer> hs=new HashSet<Integer>();
        void accept()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter n:");
            int n=sc.nextInt();
            for(int i=0;i<n;i++)
                {
                    System.out.println("enter element:");
                    int ele=sc.nextInt();
                    hs.add(ele);
                }
            System.out.println(hs);

            System.out.println(hs.contains(13));
            hs.remove(13);
            System.out.println(hs);
            
        }    
    }
public class hashsett{
    public static void main(String[] args)
    {
        hashing hash=new hashing();
        hash.accept();
    }
}
