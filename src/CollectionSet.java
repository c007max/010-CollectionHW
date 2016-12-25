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
		
		//	sort the list
		Collections.sort(ll_int);
		
		System.out.println("");
		
		for	(int ii=0; ii<ll_int.size();	ii++)
		{
			System.out.printf("int %d\n"	,ll_int.get(ii))	;
		}

		System.out.println("");
		
		//	shuffle the list
		Collections.shuffle(ll_int, r1)	;
		
		System.out.println("");
		
		for	(int ii=0; ii<ll_int.size();	ii++)
		{
			System.out.printf("int %d\n"	,ll_int.get(ii))	;
		}
	}
}
