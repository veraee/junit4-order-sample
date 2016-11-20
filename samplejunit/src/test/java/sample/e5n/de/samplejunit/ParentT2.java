package sample.e5n.de.samplejunit;

import org.junit.Before;
import org.junit.Test;

public class ParentT2 {
	
	@Before
	public void setup4() {
		System.out.println("ParentT2: setup4");
	}
	
	@Before
	public void setup1() {
		System.out.println("ParentT2: setup1");
	}
	
	@Before
	public void setup3() {
		System.out.println("ParentT2: setup3");
	}
	
	@Test
	public void inP() {
		System.out.println("ParentT2: inP");
	}

}
