package kr.or.dgit.my_erp.ui.content;

import javax.swing.BoxLayout;
import javax.swing.JOptionPane;

import kr.or.dgit.my_erp.dto.Title;
import kr.or.dgit.my_erp.service.TitleService;
import kr.or.dgit.my_erp.ui.basic.TextFieldPanel;

public class TitleContent extends AbsContent<Title> {

	private TextFieldPanel pTNo;
	private TextFieldPanel pTName;

	public TitleContent() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		pTNo = new TextFieldPanel();
		pTNo.setTitle("번호");
		pTNo.setTfValue(setNo());
		pTNo.gettF().setEnabled(false);
		add(pTNo);

		pTName = new TextFieldPanel();
		pTName.setTitle("직책명");
		add(pTName);

	}

	@Override
	public void setObject(Title t) {
		pTNo.setTfValue(String.format("T%03d", t.gettCode()));
		pTName.setTfValue(t.gettName());
	}

	@Override
	public Title getObject() {
		int tCode = Integer.parseInt(pTNo.getTfValue().substring(1, pTNo.getTfValue().length()));
		String tName = pTName.getTfValue();
		return new Title(tCode, tName);
	}

	@Override
	public void clearAll() {
		pTNo.setTfValue(setNo());
		pTName.setTfValue("");

	}

	@Override
	public boolean checkItem() {
		if (pTName.getTfValue().equals("")) {
			JOptionPane.showMessageDialog(null, "빈칸이 존재합니다");
			return false;
		} else
			return true;
	}

	@Override
	public String setNo() {
		return String.format("T%03d", TitleService.getInstance().selectLastNum()+1);
	}

}