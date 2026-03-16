import java.util.Scanner;
class mark
{
 public static void main(String[] args)
 { 
  Scanner sc=new Scanner(System.in);
  System.out.print("enter number of subjects :");
  int n=sc.nextInt();
  int[] marks=new int[n];
  int total=0;
  for(int i=0;i<n;i++)
  {
   System.out.print("enter mark of subjects "+(i+1)+" :");
   marks[i]=sc.nextInt();
   total +=marks[i];
  }
  double percentage = (double) total / (n * 100) * 100;
  System.out.println("total marks :"+total);
  System.out.println("percentage :"+percentage+"%");
 }
}
