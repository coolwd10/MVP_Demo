package com.example.wdidevashah.mvp_demo.Framework;

public interface IObjectList extends IObject {
	IObject GetItem(int index);
	int Count();
	int IndexOfObject(IObject obj);
	void AddItem(IObject obj);
	void Remove(int index);
	void Remove(IObject obj);
	void RemoveAll();
	void ReplaceItemAtIndex(IObject obj, int i);
	void InsertItemAtIndex(IObject obj, int index);
	void ClearAndAdd(IObjectList list);
}
