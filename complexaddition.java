import java.util.Scanner;
class complex
{
	int real,imaginary;
	complex(int r,int i)
	{
		real=r;
		imaginary=i;
	}
	complex add(complex c)
	{
		return new complex(this.real+c.real,this.imaginary+c.imaginary);
	}
	void display()
{
    if (imaginary >= 0)
        System.out.print(real + " + " + imaginary + "i");
    else
        System.out.print(real + " - " + (-imaginary) + "i");
}

}

class complexaddition
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter real part of first complex number:");
		int r1=sc.nextInt();
		System.out.print("Enter the imaginary part of first complex number:");
		int i1=sc.nextInt();
		
		System.out.print("Enter real part of second complex number:");
		int r2=sc.nextInt();
		System.out.print("Enter the imaginary part of second complex number:");
		int i2=sc.nextInt();
		
		complex c1=new complex(r1,i1);
		complex c2=new complex(r2,i2);
		complex sum=c1.add(c2);
		c1.display();
		System.out.print("+");
		c2.display();
		System.out.print("\nSum= \t");
		sum.display();
	}
}
