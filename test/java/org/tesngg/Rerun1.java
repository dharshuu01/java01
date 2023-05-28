package org.tesngg;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Rerun1 {
@Test
private void tc1() {
Assert.assertTrue(true);
System.out.println("tc1");

}

@Test(retryAnalyzer=FailedTest.class)
private void tc2() {
Assert.assertTrue(false);
System.out.println("tc2");

}
@Test
private void tc3() {
Assert.assertTrue(true);
System.out.println("tc2");

}
	
	
}



