import java.util.*	;

public class CollectionSet {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		int	nodeK	= 20	;
		LinkedList<Integer>	ll_int	= new LinkedList<Integer>()	;
		Random r1	= new Random();
		
		for (int ii=0 ;	ii<nodeK ;	ii++)
		{
			ll_int.add(r1.nextInt(1000));
		}
		
		Iterator<Integer> i1	= ll_int.iterator()	;		
		while (i1.hasNext())
		{
			System.out.printf("int %d\n"	,i1.next());
		}
		
		//	0050	sort the list
		Collections.sort(ll_int);
		
		System.out.printf("\t>>> 0050 sort <<<\n");
		
		for	(int ii=0; ii<ll_int.size();	ii++)
		{
			System.out.printf("int %d: %d\n"	
					,ii+1
					,ll_int.get(ii))	;
		}
	
		//	0100	shuffle the list
		Collections.shuffle(ll_int, r1)	;
		
		System.out.printf("\t>>> 0100 shuffle <<<\n");
		
		for	(int ii=0; ii<ll_int.size();	ii++)
		{
			System.out.printf("int %d: %d\n"	
					,ii+1
					,ll_int.get(ii))	;
		}
				
		//	0150	reverse sort the list
		
		TH_sort sort1	= new TH_sort	(ll_int	)	;
		sort1.start()	;
		
		System.out.printf("\t>>> 0150 reverse sort <<<\n");
		
/*		for	(int ii=0; ii<ll_int.size();	ii++)
		{
			System.out.printf("int %d: %d\n"	
					,ii+1
					,ll_int.get(ii))	;
		}
*/
		
		//	0200	get max value
		
		System.out.println("\t>>> 0200 get max value <<<\n");
		
		TH_max	max1	= new TH_max	(ll_int);
		max1.start();
	}
}
