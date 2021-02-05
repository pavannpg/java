package com.demo.java;

import static org.junit.jupiter.api.Assertions.*;

import java.util.zip.InflaterOutputStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

class AppTest {
	App a = null;

	@BeforeEach
	void init(TestInfo info, TestReporter reporter)
	{
		a = new App();
		reporter.publishEntry("Running "+info.getDisplayName()+" "+info.getTags());
	}
	
	@Test
	@Tag("Math")
	@DisplayName("Test Addition")
	void testAdd() {
		int actual = a.add(1, 1);
		assertEquals(2, actual,"Should add two numbers");
	}
	
	@Tag("Math")
	@DisplayName("Test Division")
	void testDivision() {
		fail("Not yet implemented");
	}
	
	@AfterEach 
	public void clean()
	{
		a = null;
	}
	
}
