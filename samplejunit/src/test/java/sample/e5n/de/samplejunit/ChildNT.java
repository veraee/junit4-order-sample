package sample.e5n.de.samplejunit;

import org.junit.Before;
import org.junit.Test;

/**
 * junit 4 order: child.
 */
public class ChildNT extends AbstractParentT {

	@Before
	public void setup5() {
		System.out.println("ChildT: setup5");
	}

	/**
	 * with (at)Before:
	 * 
	 * <pre>
	 * AbstractParentT: setup3
	 * ChildT: setup1
	 * ChildT: setup5
	 * ChildT: setup4
	 * ChildT: setup2
	 * ChildT: oneCheck
	 * AbstractParentT: setup3
	 * ChildT: setup1
	 * ChildT: setup5
	 * ChildT: setup4
	 * ChildT: setup2
	 * AbstractParentT: inP
	 * </pre>
	 * 
	 * without (at)Before:
	 * 
	 * <pre>
	 * ChildT: setup4
	 * AbstractParentT: setup3
	 * ChildT: setup1
	 * ChildT: setup5
	 * ChildT: setup2
	 * ChildT: oneCheck
	 * ChildT: setup4
	 * AbstractParentT: setup3
	 * ChildT: setup1
	 * ChildT: setup5
	 * ChildT: setup2
	 * AbstractParentT: inP
	 * </pre>
	 */
	// @Before
	public void setup4() {
		System.out.println("ChildT: setup4");
	}

	public void setup1() {
		System.out.println("ChildT: setup1");
	}

	@Before
	public void setup2() {
		System.out.println("ChildT: setup2");
	}

	@Test
	public void oneCheck() {
		System.out.println("ChildT: oneCheck");

	}
}
