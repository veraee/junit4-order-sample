package sample.e5n.de.samplejunit;

import org.junit.Before;
import org.junit.Test;

/**
 * junit 4 order: child.
 */
public class ChildT2 extends ParentT2 {

	@Before
	public void setup1() {
		System.out.println("ChildT2: setup1");
	}
	
	@Before
	public void setup2() {
		System.out.println("ChildT2: setup2");
	}
	
	@Test
	public void oneCheck() {
		System.out.println("ChildT2: oneCheck");

	}
}
