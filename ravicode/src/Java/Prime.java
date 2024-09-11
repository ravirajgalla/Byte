package Java;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=1;

while(i<=20) {
	int j=1,c=0;
	while(j<=i) {
	if(i%j==0)
		c++;
	j++;
	}
	if(c<=2&&i!=1&&i!=2)
		System.out.println(i);
	i++;
}
	}
}