package com.example.wdidevashah.mvp_demo.Wrappers;

import com.example.wdidevashah.mvp_demo.Framework.IMutableString;

public class MutableString implements IMutableString {

    private StringBuilder stringBuilder = new StringBuilder();

    public MutableString() {
    	stringBuilder = new StringBuilder();
    }
    
    public MutableString(String str) {
    	stringBuilder = new StringBuilder(str);
    }
    
    public IMutableString AppendString(String str) {
        stringBuilder.append(str);
        return this;        
    }

    public IMutableString AppendChar(char chr) {
        stringBuilder.append(chr);
        return this;        
    }

    public IMutableString AppendInt(int in) {
        stringBuilder.append(in);
        return this;         
    }
    
    public IMutableString AppendLong(long longValue) {
        stringBuilder.append(longValue);
        return this;         
    }

    public IMutableString PrependString(String str) {
        stringBuilder.insert(0, str);
        return this;         
    }

    public IMutableString PrependChar(char chr) {
        stringBuilder.insert(0, chr);
        return this;        
    }

    public IMutableString PrependInt(int in) {
        stringBuilder.insert(0, in);
        return this;      
    }
    
    public IMutableString PrependLong(long lng) {
        stringBuilder.insert(0, lng);
        return this;      
    }
    
    public String ReturnString() {
        return stringBuilder.toString();
    }

    public IMutableString SetMutableString(String str) {
        stringBuilder = new StringBuilder(str);
        return this; 
    }

    public void Free() {
    }

    public void AddReference() {
    }

    public void ReleaseReference() {
    }

	@Override
	public int Length() {
		return stringBuilder.length();
	}

	@Override
	public String GetClassName() {
		return this.getClass().getSimpleName();
	}
}
