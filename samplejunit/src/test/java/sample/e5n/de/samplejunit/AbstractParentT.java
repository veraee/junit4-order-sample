package sample.e5n.de.samplejunit;

import org.junit.Before;
import org.junit.Test;

public abstract class AbstractParentT {
	
	@Before
	public void setup4() {
		System.out.println("AbstractParentT: setup4");
	}
	
	@Before
	public void setup1() {
		System.out.println("AbstractParentT: setup1");
	}
	
	@Before
	public void setup3() {
		System.out.println("AbstractParentT: setup3");
	}
	
	@Test
	public void inP() {
		System.out.println("AbstractParentT: inP");
	}
	

}
