package Java;
public class ravicode {
	public static void main(String[] args) 
	{	
	int n=13,count=0;
	 for(int i=1;i<=n;i++){
	              if(n%i==0)
	                   count++;	 
	                     }     						 
	if(count>2)
        System.out.println(" Not prime");
  else
         System.out.println("prime");  
	}
}

