import java.util.Collections;
import java.util.LinkedList;

public class TH_max extends Thread
{
	private final LinkedList<Integer> LL_int ;
	
	public TH_max	(LinkedList<Integer> LL0
						)
	{
		this.LL_int	= LL0 ;
	}
	
	public void run() 
	{	
		System.out.printf("\t>> th_sort start <<\n"	
				);
				
		System.out.printf("\t>> th_max: %d <<\n"
				,Collections.max(LL_int)
				);
		return ;
	}
}
