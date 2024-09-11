package Java;

public class eveodsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int i=1,evesum=0,odsum=0;
 int n=100;
 while(i<=n) {
	 if(i%2==0)
	 {
		 evesum+=i;
	 }
	 else
		 odsum+=i;
	 i++;
 }
 System.out.println("sum of even numbers upto "+n+" : "+evesum);
 System.out.println("sum of odd numbers upto "+n+" : "+odsum);
	}

}
