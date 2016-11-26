package sample.e5n.de.samplejunit;

public class LazyCache {
	
	public interface CacheSystemProviderProvider {
		CacheSystemProvider provider();
	}

	public static <T, K0, K1> CProto2<T, K0, K1> cacheFor2(CacheSystemProviderProvider csProviderProvider, final int numEle, final EntryFactoryFor2<T> makeentry) {
		return new CProto2<T, K0, K1>(csProviderProvider) {

			@Override
			public T entry(String keypartAsStr0, String keypartAsStr1) {
				return makeentry.entry(keypartAsStr0, keypartAsStr1);
			}
		};

	}
}
