package Java;

public class Autotropicnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int i=6,sum=0,flag=0,sum1=0;
 int sqr=i*i;
 while(sqr>0) {
	 int rem=sqr%10;
	 sum+=rem;
	 while(i>0) {
		 int rem1=i%10;
		 sum1=sum1+rem1;
		 i/=10;
	 }
	 if(sum==sum1)
		 flag=1;
	 sqr/=10;
 }
 if(flag==1)
	 System.out.println("Autotrophic number");
 else
	 System.out.println("Not an autotrophic");
	}

}
