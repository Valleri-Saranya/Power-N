import java.util.*;
public class Power
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num = 0,pow=0;
System.out.print("Enter number: ");
num = sc.nextInt();
System.out.print("Enter power: ");
pow = sc.nextInt();
System.out.println(power(num,pow));
}
public static int power(int a,int b)
{
int power =1;
for(int x=0;x<b;x++)
power*=a;
return power;
}
}