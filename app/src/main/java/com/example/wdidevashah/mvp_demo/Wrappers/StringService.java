package com.example.wdidevashah.mvp_demo.Wrappers;

import android.util.Base64;

import com.example.wdidevashah.mvp_demo.Framework.IStringList;
import com.example.wdidevashah.mvp_demo.Framework.IStringService;

import java.text.DecimalFormat;

public class StringService implements IStringService {
	
	public StringService() {
	}

	@Override
	public boolean IsEqual(String str1, String str2) {
		if (str1 != null) {
			return str1.equals(str2);
		} else if (str1 == null && str2 == null) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int IndexOf(String arg0, String arg1) {
		return arg0.indexOf(arg1);
	}

	@Override
	public int ParseInt(String arg0) {
		return Integer.parseInt(arg0);
	}
	
	@Override
	public String SubString(String source, int start, int end) {
		return source.substring(start, end);
	}

	@Override
	public String GetStringValueOfInt(int arg0) {
		return String.valueOf(arg0);
	}	
	
	@Override
	public String GetStringValueOfLong(long longValue) {
		return String.valueOf(longValue);
	}

	@Override
	public int GetStringLength(String str) {
		return str.length();
	}

	@Override
	public String ReplaceAll(String sourceStr, String searchStr, String replaceStr) {
		return sourceStr.replace(searchStr, replaceStr);
	}

	@Override
	public boolean IsStringStartsWith(String source, String string) {
		return source.startsWith(string);
	}

	@Override
	public boolean IsContains(String source, String str) {
		if (source == null) {
			return false;
		}
		return source.contains(str);
	}
	
	@Override
	public IStringList SplitString(String source, String string) {
		String[] values = source.split(string);
		IStringList vList = PlatformFactoryLocator.GetPlatformFactory().CreateStringList();
		for (String s : values) {
			vList.AddItem(s);
		}
		return vList;
	}

	@Override
	public String GetStringValueOfDouble(double doubleValue) {
		return String.valueOf(doubleValue);
	}

	@Override
	public String RemoveLastOccurence(String source, String string) {
		int indexOf = source.lastIndexOf(string);
		if (indexOf < 0) {
			return source;
		}
		return source.substring(0, indexOf) + source.substring(indexOf + 1);
	}

	@Override
	public char GetCharAt(String source, int index) {
		return source.charAt(index);
	}

	@Override
	public String TrimString(String source) {
		return source.trim();
	}

	@Override
	public float ParseFloat(String strvalue) {
		return Float.parseFloat(strvalue);
	}

	@Override
	public String GetStringValueOfFloat(float floatValue) {
		return Float.toString(floatValue);
	}

	@Override
	public double ParseDouble(String strValue) {
		return Double.parseDouble(strValue);
	}

	@Override
	public int LastIndexOf(String source, String string) {
		return source.lastIndexOf(string);
	}

	@Override
	public boolean IsNullOrEmpty(String str) {
		return str == null || str.length() == 0;
	}

	@Override
	public int CompareToIgnoreCase(String source, String target) {
		return source.compareToIgnoreCase(target);
	}

	@Override
	public String GetLowerCaseOfString(String str) {
		return str.toLowerCase();
	}
	
	@Override
	public String GetUpperCaseOfString(String str) {
		return str.toUpperCase();
	}
	
	public boolean IsNumber(String str) {
		try {
			Float.parseFloat(str);
			return true;
		}
		catch(NumberFormatException nfe){
			return false;
		}
	}

	@Override
	public long ParseLong(String str) {
		return Long.parseLong(str);
	}

	@Override
	public String GetClassName() {
		return this.getClass().getSimpleName();
	}

}
