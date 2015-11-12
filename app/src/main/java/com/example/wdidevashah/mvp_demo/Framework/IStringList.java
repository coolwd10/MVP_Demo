package com.example.wdidevashah.mvp_demo.Framework;


public interface IStringList extends IObject {
	String GetItem(int index);
	int Count();
	int IndexOfObject(String obj);
	void AddItem(String obj);
	void AddItemAtIndex(String item, int index);
	void RemoveItem(int index);
	void Remove(String obj);
	boolean IsHavingItem(String item);
	IStringList GetAlphabeticallySortedList();
	void SortAphabetically();
	void RemoveAll();
}
