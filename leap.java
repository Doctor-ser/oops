import java.util.Scanner;
class leap
{
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter the year :");
 int a=sc.nextInt();
  if((a%400==0 || a%4==0 && a%100!=0))
  {
   System.out.println("Is Leap Year");
  }
  else
   System.out.println("Not Leap year !!");
}
}
