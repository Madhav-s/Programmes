import java.util.scanner;
public class Digit1
{
int num;
void getNumber()
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter The Number");
num= sc.next.Int();
}
void calculate()
{ 
int d;
int n = num;
int prod=1;
while(n!=0)
{
 d=n%10;
 n=n/10;
 prod = prod * d;
 }
 System.out.println("The product of the digits is" +prod);
 }
 public static void main()
 {
 Digit1 obj = new Digit1 ();
 obj.getnumber ();
 obj.calculate ();
 }
 }
 
