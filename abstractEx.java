abstract class anatomy {
    public abstract void brain();
    public void dentist()
    {
        System.out.println("The study of teeth is called dentistry.");
    }
}

class science extends anatomy {
    public void brain() {
        System.out.println("The study of brain is neuroscience");
    }
}

public class abstractEx{
    public static void main(String[] args) {
        science sc = new science();
        sc.brain();
        sc.dentist();
    }
}