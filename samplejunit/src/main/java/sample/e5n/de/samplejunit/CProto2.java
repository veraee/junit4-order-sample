package sample.e5n.de.samplejunit;

public abstract class CProto2<V,K0,K1> {
	
	public V get(K0 keypart0, K1 keypart1) {
		String hkey = key(keypart0, keypart1);
		//
		String ks0 = "h1";
		String ks1 = "h2";
		
		return entry(ks0, ks1);
	}
    public String key(K0 keypart0, K1 keypart1) {
    	return keypart0.toString() + keypart1.toString();
    }
    
    public abstract V entry(String keypartAsStr0, String keypartAsStr1);
}
