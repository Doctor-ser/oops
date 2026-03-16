import java.util.Scanner;
class oddeven
{
public static void main(String[] args)
{
 System.out.print("Enter the number :");
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 if(n%2==0)
  System.out.println("Even");
 else
  System.out.println("Odd");
}
}
