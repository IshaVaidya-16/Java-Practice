import java.util.*;

class avgAge
    {
        public int age,n;
        public void calculate()
        {
            System.out.println("enter n:");
                Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
            int age[]=new int[n];
            for(int i=0;i<n;i++)
                {
            System.out.println("enter age of student  "+i);
                    age[i]=sc.nextInt();
                    
        }
            double average;
            double summ=0;
            for(int j=0;j<age.length;j++)
                {
                    summ+=age[j];
                }
            average=summ/(age.length);
            System.out.printf("The average age is %.2f%n",average);
    }
    }
class Main {
    public static void main(String[] args)
    {
        avgAge ai=new avgAge();
        ai.calculate();
    }
}