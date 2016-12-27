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
		
		this.LL_int.sort(null);
		
		System.out.printf("\t>> th_sort end <<\n"
				);
		return ;
	}
}
