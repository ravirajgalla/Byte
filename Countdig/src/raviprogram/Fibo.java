package raviprogram;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		int a=1,b=1;
		if(n==1)
		{
			System.out.println(a);
		}		
		else if(n==2) {
			System.out.println(a);
			System.out.println(b);
		}
		else {
			System.out.println(a);
			System.out.println(b);
			while(n>2) {
				
				int c=a+b;
				if(c!=13&&c!=34)
				System.out.println(c);
				a=b;
				b=c;
				n--;
				
			}
		}

	}

}
