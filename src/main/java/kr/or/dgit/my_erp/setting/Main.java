package kr.or.dgit.my_erp.setting;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import kr.or.dgit.test2.DBManage;
import kr.or.dgit.test2.setting.jdbc.DBCon;
public class Main {

	public static void main(String[] args) {
		DBManage frame = new DBManage();
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				DBCon.closeConnection();
			}
		});
		frame.setVisible(true);
	}
}
