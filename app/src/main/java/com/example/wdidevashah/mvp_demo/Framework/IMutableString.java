package com.example.wdidevashah.mvp_demo.Framework;

public interface IMutableString extends IObject {
	IMutableString AppendString(String str);
	IMutableString AppendChar(char chr);
	IMutableString AppendInt(int integer);
	IMutableString AppendLong(long lng);
	IMutableString PrependString(String str);
	IMutableString PrependChar(char chr);
	IMutableString PrependInt(int integer);
	IMutableString PrependLong(long lng);
	String ReturnString();
	IMutableString SetMutableString(String str);
	int Length();
}
