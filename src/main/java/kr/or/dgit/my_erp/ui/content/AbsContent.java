package kr.or.dgit.my_erp.ui.content;

import javax.swing.JPanel;

public abstract class AbsContent<T> extends JPanel{
	public abstract void setObject(T t);
	public abstract T getObject();
	public abstract void clearAll();
	public abstract boolean checkItem(); 
	public abstract String setNo();
}
