package com.jt.practice;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculateVolumeTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void testCalculateVolumeInt() {
		int result = 125;
		int r = CalculateVolume.calculateVolume(5);
		Assertions.assertEquals(result, r);
	}

}
