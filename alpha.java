import java.util.Scanner;
public class alpha {
	int real,img;
	static int rsum(alpha a1, alpha a2)
	{
		int s=a1.real+a2.real;
		return s;
	}
	static int isum(alpha a1, alpha a2)
	{
		int s=a1.img+a2.img;
		return s;

	}
    static void display(alpha a)
    {
    	System.out.println("Real part="+a.real);
    	System.out.println("Imaginary part "+a.img);
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		alpha a1=new alpha();
		System.out.println("ENTER REAL PART OF FIRST COMPLEX NO.");
		a1.real=sc.nextInt();
		System.out.println("ENTER COMPLEX PART OF FIRST COMPLEX NO.");
		a1.img=sc.nextInt();
		a1.display(a1);
		alpha a2= new alpha();
		System.out.println("ENTER REAL PART OF SECOND COMPLEX NO.");
		a2.real=sc.nextInt();
		System.out.println("ENTER COMPLEX PART OF SECOND COMPLEX NO.");
		a2.img=sc.nextInt();
	   a2.display(a2);
		alpha a3= new alpha();
		a3.real=rsum(a1,a2);
		a3.img=isum(a1,a2);
		System.out.println("Sum of two complex numbers");
		a3.display(a3);
	}
	

	}
