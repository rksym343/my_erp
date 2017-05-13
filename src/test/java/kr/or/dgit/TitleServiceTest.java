package kr.or.dgit;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.dto.Title;
import kr.or.dgit.service.TitleService;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TitleServiceTest {
	private static TitleService TitleService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		TitleService = new TitleService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		TitleService = null;
	}

	@Test
	public void aTestInsertTitle() {
		Title item = new Title(6, "계약직");

		int res = TitleService.insertTitle(item);
		Assert.assertSame(1, res);
	}
	
	@Test
	public void bTestUpdateTitle() {
		Title item = new Title(6, "임시");
		int res = TitleService.updateTitle(item);
		Assert.assertSame(1, res);
	}
	
	@Test
	public void cTestselectTitle() {
		Title item = new Title();
		item.settCode(6);
		Title newItem = TitleService.selectTitle(item);
		Assert.assertNotNull(newItem);
	}
	
	@Test
	public void dTestDeleteTitle() {
		Title item = new Title();
		item.settCode(6);
		int res = TitleService.deleteTitle(item);
		Assert.assertSame(1, res);
	}
	
	@Test
	public void eTestSelectByAll() {
		List<Title> items = TitleService.selectByAll();
		Assert.assertNotNull(items);
	}


}
