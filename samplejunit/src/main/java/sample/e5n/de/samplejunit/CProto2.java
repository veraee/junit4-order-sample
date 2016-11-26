package sample.e5n.de.samplejunit;

import sample.e5n.de.samplejunit.LazyCache.CacheSystemProviderProvider;

public abstract class CProto2<V,K0,K1> {
	
	private CacheSystemProviderProvider csProviderProvider;
	private EhCacheFactory ehcachefactory;

	public CProto2(CacheSystemProviderProvider csProviderProvider) {
		this.csProviderProvider = csProviderProvider;
		this.ehcachefactory = new EhCacheFactory() {
			@Override
			public Object createEntry(Object key) {
				// decode key:
				String ks0 = "h1";
				String ks1 = "h2";
				return entry(ks0, ks1);
			}
		};
	}
	
	public V get(K0 keypart0, K1 keypart1) {
		String hkey = key(keypart0, keypart1);
		return csProviderProvider.provider().get().get(hkey);
		
	}
	
    public String key(K0 keypart0, K1 keypart1) {
    	//encode:
    	return keypart0.toString() + keypart1.toString();
    }
    
    public abstract V entry(String keypartAsStr0, String keypartAsStr1);
}
