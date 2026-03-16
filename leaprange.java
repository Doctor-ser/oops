import java.util.Scanner;
class leaprange
{
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter the starting year :");
 int a=sc.nextInt();
 System.out.print("Enter the ending year :");
 int b=sc.nextInt();
 System.out.println("Leap years :");
 for(int y=a;y<=b;y++)
 {
  if((y%400==0 || y%4==0 && y%100!=0))
  {
   System.out.println(y);
  }
 }
}
}
