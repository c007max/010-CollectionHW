import java.util.Collections;
import java.util.LinkedList;

public class TH_sort extends Thread
{
	private final LinkedList<Integer> LL_int ;
	
	public TH_sort	(LinkedList<Integer> LL0
						)
	{
		this.LL_int	= LL0 ;
	}
	
	public void run() 
	{	
		System.out.printf("\t>> th_sort start <<\n"	
				);
		
		Collections.reverse(LL_int);
		
		for	(int ii=0; ii<LL_int.size();	ii++)
		{
			System.out.printf("th_sort %d: %d\n"	
					,ii+1
					,LL_int.get(ii))	;
		}
		
		System.out.printf("\t>> th_sort end <<\n"
				);
		return ;
	}
}
