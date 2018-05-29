import java.util.Scanner;


public class Fibo extends Thread {
	
	public void run()
	{
		
		 Scanner sc =new Scanner(System.in);
		 int p =sc.nextInt();

	     int x=0;
		 int y=1;
		 int z;
		
			for (int i = 0;i<p ; i++) 
			{
				z=x+y;
				y=x;
				x=z;
				System.out.println("fibonacci series:"+z);
				
}
	
			
			try {
				Thread.sleep(300);
			} 
    		catch (InterruptedException e) {
			
}
}
}
