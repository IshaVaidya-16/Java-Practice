import java.util.*;
class hashmapp{
  HashMap<Integer,String> hm=new HashMap<Integer,String>();
  Scanner sc=new Scanner(System.in);
  void accept()
  {
    System.out.println("Enter n:");
    int n=sc.nextInt();
    int key;
    String val;
    for(int i=0;i<n;i++)
    {
      System.out.println("enter key(int):");
      key=sc.nextInt();
      System.out.println("enter value(string):");
      val=sc.next();
      hm.put(key,val);
    }
    System.out.println(hm);
    System.out.println("-----------------\nsize of hashmap is: "+hm.size());
  }

  void getvalue()
  {
    int prb;
    System.out.println("enter key to find its value:");
    prb=sc.nextInt();
    if(hm.containsKey(prb))
    {
    System.out.println("the value found is: "+hm.get(prb));
    }
    else{
      System.out.println("no such key found");
    }
  }

  void removeKey()
  {
    int prb;
    System.out.println("enter key to remove its value:");
    prb=sc.nextInt();
    if(hm.containsKey(prb))
    {
    hm.remove(prb);
    System.out.println("the value is removed");
    System.out.println(hm);
    }
    else{
      System.out.println("no such key found");
    }
  }
  void looping()
  {
    System.out.println("printing only keys:");
    for(Integer i:hm.keySet())
    {
      System.out.println(i);
    }
    System.out.println("printing only values:");
    for(String i:hm.values())
    {
      System.out.println(i);
    }
  }
}

public class hashmap {
  public static void main(String[] args)
  {
    hashmapp hmap=new hashmapp();
    hmap.accept();
    hmap.getvalue();
    hmap.removeKey();
    hmap.looping();
    System.out.println("===============================\nprogram ended");
  }
}
