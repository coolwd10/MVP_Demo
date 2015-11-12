package com.example.wdidevashah.mvp_demo.Platform;

import com.example.wdidevashah.mvp_demo.Application.MVPApplication;
import com.example.wdidevashah.mvp_demo.Framework.IMobilePlatformFactory;
import com.example.wdidevashah.mvp_demo.Framework.IMutableString;
import com.example.wdidevashah.mvp_demo.Framework.IObjectList;
import com.example.wdidevashah.mvp_demo.Framework.IStringService;
import com.example.wdidevashah.mvp_demo.Wrappers.MutableString;
import com.example.wdidevashah.mvp_demo.Wrappers.ObjectList;
import com.example.wdidevashah.mvp_demo.Wrappers.StringService;

public class PlatformFactory implements IMobilePlatformFactory {

	private MVPApplication mMVPApplication;
	private IStringService mStringService;

	public PlatformFactory(MVPApplication context) {
		mMVPApplication = context;

	}

	@Override
	public IObjectList CreateObjectList() {
		return new ObjectList();
	}

	@Override
	public IMutableString CreateMutableString() {
		return new MutableString();
	}

	@Override
	public IStringService CreateStringService() {
		if (mStringService == null) {
			mStringService = new StringService();
		}
		return mStringService;
	}


	@Override
	public String GetClassName() {
		return null;
	}
}
