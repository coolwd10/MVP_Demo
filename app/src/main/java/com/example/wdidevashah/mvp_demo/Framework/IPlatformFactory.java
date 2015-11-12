package com.example.wdidevashah.mvp_demo.Framework;

public interface IPlatformFactory extends IObject {

	IObjectList CreateObjectList();

	IMutableString CreateMutableString();

	IStringService CreateStringService();

}
