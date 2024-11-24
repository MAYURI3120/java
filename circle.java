import java.util.*;
public class circle
{
public static double calcircm(double r)
{
double circum=2*3.14*r;
return circum;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
double r=sc.nextDouble();
System.out.println(calcircm(r));
}
}