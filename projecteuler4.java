/*
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class projecteuler4 {

	public static void main(String[] args) {
		int i,j,p=1,m,d,n,result=0;
		for(i=100;i<=999;i++)
		{
			for(j=100;j<=i;j++)
			{
				p=i*j;
				n=p;m=0;
				while(n>0)
				{
					d=n%10;
					m=(m*10)+d;
					n=n/10;
				}
				if(p==m && p>result)
					result=p;
					

			}
			
			
		}
		System.out.println("largest palindrome made from the product of two 3-digit numbers ="+result);

	}

}
