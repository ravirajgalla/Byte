package Java;

public class Strong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=6,sum=0;
int i=1;
while(i<n) {
	if(n%i==0) {
		sum+=i;
	}
	i++;
}
if(n==sum)
	System.out.println("perfect number");
else
	System.out.println("Not a perfect number");
}

}
