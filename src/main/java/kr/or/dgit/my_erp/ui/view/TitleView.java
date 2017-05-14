package kr.or.dgit.my_erp.ui.view;

import javax.swing.JFrame;

import kr.or.dgit.my_erp.dto.Title;
import kr.or.dgit.my_erp.service.TitleService;
import kr.or.dgit.my_erp.ui.content.AbsContent;
import kr.or.dgit.my_erp.ui.content.TitleContent;
import kr.or.dgit.my_erp.ui.table.AbsTable;
import kr.or.dgit.my_erp.ui.table.TitleTable;

public class TitleView extends AbsView<Title> {

	public TitleView() {
		setTitle("직책 관리");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
	}

	@Override
	protected AbsTable<Title> createTable() {
		return new TitleTable();
	}

	@Override
	protected AbsContent<Title> createContent() {
		return new TitleContent();
	}

	@Override
	protected void deleteItem(Title t) {
		TitleService.getInstance().deleteTitle(t);
	}

	@Override
	protected void updateItem(Title t) {
		TitleService.getInstance().updateTitle(t);
		
	}

	@Override
	protected void insertItem(Title t) {
		TitleService.getInstance().insertTitle(t);		
	}

}