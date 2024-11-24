import java.util.*;
public class vote
{
public static int eligible(int age)
{
if(age>18)
{
System.out.println("Eligible to vote");
return age;
}
else
{
System.out.println("Not eligible to vote");
return age;
}
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int age=sc.nextInt();
System.out.println(eligible(age));
}
}