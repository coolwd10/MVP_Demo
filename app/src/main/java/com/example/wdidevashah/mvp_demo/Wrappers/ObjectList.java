package com.example.wdidevashah.mvp_demo.Wrappers;

import com.example.wdidevashah.mvp_demo.Framework.IObject;
import com.example.wdidevashah.mvp_demo.Framework.IObjectList;

import java.util.ArrayList;

public class ObjectList  implements IObjectList {


	private ArrayList<IObject> arrayList;

	public ObjectList() {
		arrayList = new ArrayList<IObject>();
	}

	public IObject GetItem(int index) {
		if (index >= arrayList.size()) {
			return null;
		}
		return arrayList.get(index);
	}

	public int Count() {
		return arrayList.size();
	}

	public int IndexOfObject(IObject obj) {
		return arrayList.indexOf(obj); 
	}

	public void AddItem(IObject obj) {
		arrayList.add(obj);
	}
	
	public void Remove(int index) {
		arrayList.remove(index);
	}

	public void Remove(IObject obj) {
		arrayList.remove(obj);
	}
	
	@Override
	public void RemoveAll() {
		if (arrayList == null) {
			return;
		}
		int count = arrayList.size();
		for (int index = count - 1; index >= 0; index--) {
			arrayList.remove(index);
		}
		arrayList.clear();
	}
	
	@Override
	public void ReplaceItemAtIndex(IObject obj, int index) {
		arrayList.remove(index);
		arrayList.add(index, obj);		
	}

	@Override
	public void InsertItemAtIndex(IObject obj, int index) {
		arrayList.add(index, obj);	
	}
	
	@Override
	public String toString() {
		return "WDObjectList [arrayList=" + arrayList + "]";
	}

	@Override
	public String GetClassName() {
		return this.getClass().getSimpleName();
	}


	@Override
	public void ClearAndAdd(IObjectList list) {
		arrayList.clear();
		for (int i = 0; i < list.Count(); i++) {
			arrayList.add(list.GetItem(i));
		}
	}

}
