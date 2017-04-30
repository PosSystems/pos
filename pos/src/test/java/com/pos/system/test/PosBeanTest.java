package com.pos.system.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.pos.system.beans.PosBean;

public class PosBeanTest {
	private PosBean posBean;

	@Before
	public void setUp() {
		posBean = new PosBean();
	}

	@Test
	public void testInit() {
		posBean.init();
		assertNotNull("_employees should not be null", posBean.getEmployees());
		assertNotNull("_productGroups should not be null", posBean.getProductGroups());
		assertNotNull("_articles should not be null", posBean.getArticles());
		assertEquals("", 0, posBean.getDayTotal(), 0);
	}

	@Test
	public void testAddArticle() {
		fail("Not yet implemented");
	}

	@Test
	public void testCalculateLumpSumPrice() {
		fail("Not yet implemented");
	}

	@Test
	public void testCalculateDrawback() {
		fail("Not yet implemented");
	}

	@Test
	public void testReset() {
		fail("Not yet implemented");
	}

	@Test
	public void testCalculateCashCheckDifference() {
		fail("Not yet implemented");
	}

	@Test
	public void testFill_in_memory_db() {
		fail("Not yet implemented");
	}

}
