import java.util.Scanner;


public class Prime extends Thread{
	
	public void run()
	{


		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int f;
		for (int i = 2; i <=n; i++) {
			f=0;
			for (int j = 2; j <=Math.sqrt(i); j++) {
				if(i%j==0)
				{
					f=1;
					break;
					
				}
				else {
					f=0;
				}
				
				
			}
			if(f==0)
			{
				System.out.print(" "+i);
			}
			
			try {
				Thread.sleep(300);
			} 
    		catch (InterruptedException e) {
			
			
		}
	}
		
		
		
		}
	
}