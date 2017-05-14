package kr.or.dgit.my_erp.ui.basic;

import java.awt.Component;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class CheckBoxPanel extends CompPanel {

	public CheckBoxPanel() {
		pValue.setLayout(new GridLayout(1, 0, 0, 0));
	}

	public void setCheckItems(String... items) {
		for (int i = 0; i < items.length; i++) {
			pValue.add(new JCheckBox(items[i]));
		}
	}

	public void setSelectedItems(ArrayList<String> items) {
		JCheckBox jcb = null;
		for (String item : items) {
			for (Component c : pValue.getComponents()) {
				jcb = (JCheckBox) c;
				if (jcb.getText().equals(item)) {
					jcb.setSelected(true);
				}
			}
		}
	}

	public void setClearItems() {
		for (Component c : pValue.getComponents()) {
			((JCheckBox) c).setSelected(false);
		}
	}

	public ArrayList<String> getSelectedItems() { // ArrayList 보다는 그 부모인 List를
													// 반환형으로 하는게 더 좋음
		JCheckBox jcb = null;
		ArrayList<String> items = new ArrayList<>();
		for (Component c : pValue.getComponents()) {
			jcb = (JCheckBox) c;
			if (jcb.isSelected()) {
				items.add(jcb.getText());
			}
		}
		return items;
	}

}
