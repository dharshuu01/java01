package org.tesngg;

import org.sample.BaseClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class C extends BaseClass{

	@Test
	private void tc1() {
	browserlaunchfrfox();
	urllaunch("https://www.facebook.com/");
	}
}
