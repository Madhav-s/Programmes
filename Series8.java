import java.util.java;
class series_8
{
    int n;
    int s=0;
   
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        n=sc.nextInt();
    }
    void calc()
    {
        for(int i=1;i<=n;i++)
        {
            s=s+i/1;
        }
        System.out.println(s);
    }
    public static void main()
    {
        series_8 obj=new series_8();
        obj.accept();
        obj.calc();
    }
}
