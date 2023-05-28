package org.tesngg;

import org.sample.BaseClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class B extends BaseClass{
	@Test
	private void tc1() {
	browserlaunchchrome();
	urllaunch("https://www.facebook.com/");
	}
	}
	

