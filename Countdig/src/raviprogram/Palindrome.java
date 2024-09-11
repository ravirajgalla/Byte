package raviprogram;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=898,sum=0;     
int temp=n;
while(n>0) {  // 89>0, 8>0
	int rem=n%10; //8 ,9, 8
	sum=sum*10+rem;//8, 89,898
	n/=10;//n=n/10 89,8,0
}
if(temp==sum) //898  == 898
	System.out.println("Palindrome");//
else
	System.out.println("Not palindrome");//
	}

}
