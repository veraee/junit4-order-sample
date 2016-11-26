package sample.e5n.de.samplejunit;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App {
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        CProto2<Integer, Boolean, Date> mycA = new CProto2<Integer, Boolean, Date>() {

        	@Override
        	public String key(Boolean keypart0, Date keypart1) {
        		// TODO Auto-generated method stub
        		return super.key(keypart0, keypart1);
        	}
        	
			@Override
			public Integer entry(String keypartAsStr0, String keypartAsStr1) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		CProto2<Integer, Boolean, Date> mycB = sucu2(1000, (kAsStr0,kAsStr1) -> {
			int z = Integer.parseInt(kAsStr0 + kAsStr1);
			z = z + 9;
			return z;
		});
		
		Integer vv = mycB.get(Boolean.TRUE,(new Date()));
		
    }

	private static <T, K0, K1> CProto2<T, K0, K1> sucu2(final int numEle, final EntryFactoryFor2<T> makeentry) {
		return new CProto2<T, K0, K1>() {

			@Override
			public T entry(String keypartAsStr0, String keypartAsStr1) {
				return makeentry.entry(keypartAsStr0, keypartAsStr1);
			}
		};

	}
}
