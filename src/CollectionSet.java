import java.util.HashSet	;
import java.util.Random	;
import java.util.LinkedList ;
import java.util.Collection	;
import java.util.Iterator;

public class CollectionSet {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		int	nodeK	= 20	;
		LinkedList<PCB> ll_top10	= new LinkedList<PCB>()	;
		HashSet<Integer>	hs_int	= new HashSet<Integer>()	;
		Random r1	= new Random();
		
		for (int ii=0 ;	ii<nodeK ;	ii++)
		{
			hs_int.add(r1.nextInt(1000));
		}
		
		Iterator<Integer> i1	= hs_int.iterator()	;		
		while (i1.hasNext())
		{
			System.out.printf("int %d\n"	,i1.next());
		}
	}

}
