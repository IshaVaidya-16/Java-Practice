import java.util.*;
import java.io.*;

class arrayList1
    {
        ArrayList<String> colors=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        public void accept()
        {
            int n;
            System.out.println("Enter n:");
            n=sc.nextInt();
            sc.nextLine(); 
            for(int i=0;i<n;i++)
                {
                    System.out.println("Enter color: ");
                    String input=sc.nextLine();
                    colors.add(input);
                }
            System.out.println("ArrayList of colors: ");
            System.out.println(colors);
        }
    }

public class arrayList{
        public static void main(String[] args)
        {
            arrayList1 al=new arrayList1();
            al.accept();
        }
    }