package kr.or.dgit.my_erp.ui.table;

import java.util.List;

import javax.swing.SwingConstants;

import kr.or.dgit.my_erp.dto.Title;
import kr.or.dgit.my_erp.service.TitleService;

public class TitleTable extends AbsTable<Title> {

	@Override
	protected void cellWith() {
		tableSetWidth(80, 100);
	}

	@Override
	protected void CellAlign() {
		tableCellAlignment(SwingConstants.CENTER, 0, 1);
	}

	@Override
	protected Object[][] getRowData() {
		List<Title> list = TitleService.getInstance().selectByAll();
		Object[][] datas = new Object[list.size()][];
		for (int i = 0; i < datas.length; i++) {
			datas[i] = list.get(i).toArray();
		}
		return datas;
	}

	@Override
	protected Object[] getColumn() {
		return new Object[] { "번호", "직책" };
	}

	@Override
	public Title getSelectedObject() {
		int selectedIdx = table.getSelectedRow();
		if (selectedIdx == -1) {
			return null;
		}
		String sNo = (String) table.getValueAt(selectedIdx, 0);
		int tCode = Integer.parseInt(sNo.substring(1, sNo.length()));
		Title title = new Title();
		title.settCode(tCode);
		return TitleService.getInstance().selectTitle(title);
	}

}
