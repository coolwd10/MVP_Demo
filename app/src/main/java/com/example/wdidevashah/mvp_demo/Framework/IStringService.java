package com.example.wdidevashah.mvp_demo.Framework;


public interface IStringService extends IObject {
	
	boolean IsNullOrEmpty(String str);
	
	boolean IsEqual(String str1, String str2);
	int IndexOf(String source, String str);
	
	int ParseInt(String str);
	
	String SubString(String source, int start, int end);
	
	String GetStringValueOfInt(int intValue);
	
	String GetStringValueOfLong(long longValue);
	
	String GetStringValueOfDouble(double doubleValue);

	int GetStringLength(String str);
	
	boolean IsContains(String source, String str);
	
	String ReplaceAll(String sourceStr, String searchStr, String replaceStr);

	boolean IsStringStartsWith(String source, String string);

	String RemoveLastOccurence(String source, String string);

	char GetCharAt(String source, int index);

	String TrimString(String source);

	float ParseFloat(String userVal);

	String GetStringValueOfFloat(float floatValue);

	double ParseDouble(String strValue);

	int LastIndexOf(String source, String string);

	int CompareToIgnoreCase(String source, String target);
	
    String GetLowerCaseOfString(String str);

	boolean IsNumber(String str);
	
	long ParseLong(String str);

	String GetUpperCaseOfString(String str);
	
}
