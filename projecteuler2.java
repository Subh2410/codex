/*
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2 , 
 * the first 10 terms will be:
 * 1,2,3,5,8,13,21,34,55,89......
 * By considering the terms in the Fibonnaci sequence
 * whose values do not exceed four million , find the sum of even valued terms
 */
public class projecteuler2 {

	public static void main(String[] args) {
		 int a=1,b=2;
		 int sum=b;
		 int c=1;
		 while(c<=4000000)
		 {
			 c=a+b;
			 a=b;
			 b=c;
			 if(c%2==0) 
				 sum+=c;
			 
		 }
		 System.out.println("The requied sum "+sum);

	}

}