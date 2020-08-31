class Series2
{
 void Series(int n)   
    {
        int sum=0;
    for(int i=0;i<=n;i++)
    {
    sum= sum + (1/i);
    }
    System.out.println("The sum is:"+ sum);
}
void series (double n, double a)
{
    
    double sum=0;
    for(int i=2; i<=n;i+=3)
    {
        
        double x=1,y=Math.pow(a,i);
        sum= sum + x/y;
        x=x+3;
        
        
    }
    
    System.out.println("The sum is:"+ sum);
    
    
}

public static void main()
{
 Series2 s= new Series2();
 s.series(4);
 s.series(6.0,4.0);   
    
}
}
