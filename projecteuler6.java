/*The sum of the squares of the first ten natural numbers is,
*1^2 + 2^2 + ... + 10^2 = 385
*The square of the sum of the first ten natural numbers is,
*
*(1 + 2 + ... + 10)^2 = 552 = 3025
*Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
*Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/

public class projecteuler6 {

	public static void main(String[] args) {
		int i,sum=0,soq=0,differ,qos=0;
		for(i=1;i<=100;i++)
		{
			soq=soq+(int)Math.pow(i,2);
			sum+=i;
		}
		qos=(int)Math.pow(sum,2);
		differ=qos-soq;
		System.out.println("difference between the sum of the squares of the first one hundred natural numbers and the square of the sum = "+differ);
	}

}
