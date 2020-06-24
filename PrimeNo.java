
import java.util.Scanner;
class PrimeNo{
public static void main(String[ ], args){
System.out.prinlin("enter a value");
int num = sc.nextline( );
boolean isPrime= true;
for(int i=2;i<num;i++)
{
if(num%i==0){
IsPrime=false;
break; }
}
if(isPrime)
{
System.out.println(num+"is a prime number ");
}
else {
System.out.println(num+"is not a prime number ");
}
}
}
