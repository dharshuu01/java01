package org.sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SampleTest {
@Test
public void tcOne() {
	System.out.println("tc1");
	}
@Test
public void tcTwo() {
System.out.println("tc2");
}
@Test
public void tcThree() {
	System.out.println("tc3");

}
@After
public void aft() {
System.out.println("tcend");

}
@AfterClass
public static void aftCls() {
System.out.println("ended");

}
@Before
public void bfr() {
System.out.println("tc starts");

}
@BeforeClass
public static void bfrcls() {
	System.out.println("Starts");

}
	}

