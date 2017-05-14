package kr.or.dgit.my_erp.ui.basic;

import java.awt.Color;
import java.awt.GridLayout;
import java.text.ParseException;
import java.util.regex.Pattern;

import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

@SuppressWarnings("serial")
public class TextFieldFormatPanel extends CompPanel {
	private JFormattedTextField tF;
	private MaskFormatter maskFormatter;

	public TextFieldFormatPanel() {
		pValue.setLayout(new GridLayout(1, 0, 0, 0));

		maskFormatter = new MaskFormatter();
		tF = new JFormattedTextField(maskFormatter);
		pValue.add(tF);
	}

	public void setMaskPattern(String pattern, char placeHolder) {
		// pattern "####-##-##", placeHolder '#'
		try {
			maskFormatter.setMask(pattern);
			maskFormatter.setPlaceholderCharacter(placeHolder);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getTfValue() {
		return tF.getText();
	}

	public void setTfValue(String value) {
		tF.setValue(value);
	}

	public boolean isEmpty() {
		if (tF.getText().equals("")) {
			return true;
		}
		return false;
	}

	/*public void isValidCheck(String regex, String value) {
		if (!Pattern.matches(regex, value)) {
			tF.requestFocus();
			tF.setSelectionStart(0);
			tF.setSelectedTextColor(Color.red);
		}
	}*/

}
