class foods
    {
        public void desi()
        {
            System.out.println("i love desi food.");
        }
    }

public class anonymous {
    public static void main(String[] args)
    {
        foods fs=new foods()
            {
                public void desi()
            {
                System.out.println("\n===================================\n");
            System.out.println("Dal-makhni, Chole-kulche bhaisaahhbb!!");
            }
    };
        fs.desi();

}
}