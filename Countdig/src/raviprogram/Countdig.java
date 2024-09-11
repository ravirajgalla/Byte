package raviprogram;

public class Countdig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a=87754,count=0;
  while(a>0) {
	  int rem=a%10;
	  count++;
	  a=a/10;
	  
  }
  System.out.println(count+" Digits");
	}

}
