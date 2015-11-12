package com.example.wdidevashah.mvp_demo.Wrappers;

import android.os.Parcel;
import android.os.Parcelable;

import com.example.wdidevashah.mvp_demo.Framework.IStringList;

import java.util.ArrayList;
import java.util.Collections;

public class StringList implements IStringList, Parcelable {

	private ArrayList<String> stringList;
    
    public StringList() {
    	stringList = new ArrayList<String>();
    }
    
    public String GetItem(int index) {
        return stringList.get(index) ;
    }

    public int Count() {
        return stringList.size();
    }

    public int IndexOfObject(String obj) {
        return stringList.indexOf(obj);
    }

    public void AddItem(String obj) {
        stringList.add(obj);
    }

    public void Remove(int index) {
        stringList.remove(index);
    }

    public void Remove(String obj) {
        stringList.remove(obj);
    }

	@Override
	public void AddItemAtIndex(String item, int index) {
		stringList.add(index, item);
	}

	@Override
	public void RemoveItem(int index) {
		stringList.remove(index);
	}  
	
	@Override
	public boolean IsHavingItem(String item) {
		return stringList.contains(item);
	}
	
	public String[] toArray() {
		String[] strArr = new String[stringList.size()];
		for (int i = 0; i < stringList.size(); i++) {
			strArr[i] = stringList.get(i);
		}
		return strArr;
	}
	
	public ArrayList<String> getList() {
		return stringList;
	}

	@Override
	public IStringList GetAlphabeticallySortedList() {
		Collections.sort(stringList);
		return this;
	}

	@Override
	public void SortAphabetically() {
		Collections.sort(stringList);
	}
	
	public void RemoveAll() {
		stringList.clear();
	}

	private StringList(Parcel in) {
		readFromParcel(in);
	}
	
	public static final Parcelable.Creator<StringList> CREATOR =
			new Parcelable.Creator<StringList>() {
		public StringList createFromParcel(Parcel in) {
			return new StringList(in);
		}

		public StringList[] newArray(int size) {
			return new StringList[size];
		}
	};
	
	public int describeContents() {
		return 0;
	}

	@Override
	public String toString() {
		return "StringList [stringList=" + stringList + "]";
	}


	public void writeToParcel(Parcel dest, int flags) {
		dest.writeStringList(stringList);
	}
	

	public void readFromParcel(Parcel parcel) {
		stringList = new ArrayList<String>();
		parcel.readStringList(stringList);
	}



	@Override
	public String GetClassName() {
		return this.getClass().getSimpleName();
	}
}
