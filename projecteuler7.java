/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10001st prime number?
 */
public class projecteuler7 {

	public static void main(String[] args) {
	 int i,n=2,c,counter=1,prime=1;
	 while(counter!=10001)
	 {   
		 n++;
		 c=0;
		 for(i=1;i<=n;i++)
		 {
			 if(n%i==0) c+=1;
		 }
		 if(c==2) 
		 {
			 counter++;
			 prime=n;
		 }
		 
	 }
	 System.out.println("The 10001st prime number = "+prime);

	}

}
