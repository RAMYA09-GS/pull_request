import java.util.Scanner;
class factorial
{
public static void main(String args[])
{
Scanner fac=new Scanner(System.in);
System.out.print("Enter a number:");
int x=fac.nextInt();

int fact=1;
for(int i=1;i<=x;i++)
fact=fact*i;
System.out.print("Factorial is " +fact);
}
}

