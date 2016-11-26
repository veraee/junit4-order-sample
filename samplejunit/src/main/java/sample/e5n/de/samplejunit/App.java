package sample.e5n.de.samplejunit;

import java.util.Date;

import sample.e5n.de.samplejunit.LazyCache.CacheSystemProviderProvider;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}

	private void mytry() {
//		CProto2<Integer, Boolean, Date> mycA = new CProto2<Integer, Boolean, Date>(csProvider) {
//
//			@Override
//			public String key(Boolean keypart0, Date keypart1) {
//				// TODO Auto-generated method stub
//				return super.key(keypart0, keypart1);
//			}
//
//			@Override
//			public Integer entry(String keypartAsStr0, String keypartAsStr1) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//		};

		// CProto2<Integer, Boolean, Date> mycB = sucu2(csProvider, 1000,
		// (kAsStr0, kAsStr1) -> {
		// int z = Integer.parseInt(kAsStr0 + kAsStr1);
		// z = z + 9;
		// return z;
		// });

		Integer vv = mycB.get(Boolean.TRUE, (new Date()));

		csProvider = new CacheSystemProvider();
		csProvider = new CacheSystemProvider();
		dep1 = new Dep1();
	}

	CacheSystemProvider csProvider;
	Dep1 dep1;

	CProto2<Integer, Boolean, Date> mycB = LazyCache.cacheFor2(() -> csProvider, 1000, (kAsStr0, kAsStr1) -> {
		int z = Integer.parseInt(kAsStr0 + kAsStr1);
		dep1.toString();
		z = z + 9;
		return z;
	});

}
