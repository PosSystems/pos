package com.pos.system.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.pos.system.beans.Article;
import com.pos.system.beans.Employee;
import com.pos.system.beans.PosBean;
import com.pos.system.beans.ProductGroup;

public class PosBeanTest {
	private PosBean posBean;

	@Before
	public void setUp() {
		posBean = new PosBean();
		posBean.init();
	}

	@Test
	public void testInit() {
		posBean.init();
		assertNotNull("_employees should not be null", posBean.getEmployees());
		assertNotNull("_productGroups should not be null", posBean.getProductGroups());
		assertNotNull("_articles should not be null", posBean.getArticles());
		assertEquals("_dayTotal should be 0", 0, posBean.getDayTotal(), 0);
		assertEquals("_selectedQuantity should be 1", 1, posBean.getSelectedQuantity());
		List<Employee> employees = posBean.getEmployees();
		assertEquals("_employees[0] should be new Employee(0,\"\")", new Employee(0, ""), employees.get(0));
		assertEquals("_employees[1] should be new Employee(1,\"Sven\")", new Employee(1, "Sven"), employees.get(1));
		assertEquals("_employees[2] should be new Employee(2,\"Dominik\")", new Employee(2, "Dominik"),
				employees.get(2));
		assertEquals("_employees[3] should be new Employee(3,\"Sandra\")", new Employee(3, "Sandra"), employees.get(3));
		List<ProductGroup> productGroups = posBean.getProductGroups();
		assertEquals("_productGroups[0] should be new ProductGroup(1, \"Bridgekameras\")",
				new ProductGroup(1, "Bridgekameras"), productGroups.get(0));
		assertEquals("_productGroups[1] should be new ProductGroup(2, \"Taschen\")", new ProductGroup(2, "Taschen"),
				productGroups.get(1));
		assertEquals("_productGroups[2] should be new ProductGroup(3, \"Speicherkarten\")",
				new ProductGroup(3, "Speicherkarten"), productGroups.get(2));
		assertEquals("_productGroups[3] should be new ProductGroup(4, \"Camcorder\")", new ProductGroup(4, "Camcorder"),
				productGroups.get(3));
		assertEquals("_productGroups[4] should be new ProductGroup(5, \"Digitalkameras\")",
				new ProductGroup(5, "Digitalkameras"), productGroups.get(4));
		assertEquals("_productGroups[5] should be new ProductGroup(6, \"SLR-Kameras\")",
				new ProductGroup(6, "SLR-Kameras"), productGroups.get(5));
	}

	@Test
	public void testAddArticle() {
		fail("Not yet implemented");
		posBean.setSelectedQuantity(4);
		posBean.setSelectedProductGroupObject(new ProductGroup(4, "Camcorder"));
		posBean.setSelectedPrice(10);
		posBean.addArticle();
		List<Article> articles = posBean.getArticles();
		assertEquals("Newest Article does not equal added Article",
				new Article(4, new ProductGroup(4, "Camcorder"), 10), articles.get(articles.size() - 1));
		assertEquals("_selectedQuantity was not reset", 1, posBean.getSelectedQuantity(), 0);
		assertEquals("_selectedPrice was not reset", 0, posBean.getSelectedPrice(), 0);
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
