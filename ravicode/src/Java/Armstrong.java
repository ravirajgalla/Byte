package Java;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int i=1;
	while(i<100) {
		int sum=0;
		int te=i;
		while(i>0){
			int rem=i%10;
			sum+=(rem*rem*rem);
			i/=10;
		}
		i=te;
		if(te==sum)
			System.out.println(te);
		i++;
	}
	}

}
