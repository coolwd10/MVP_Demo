package com.example.wdidevashah.mvp_demo.Wrappers;

import com.example.wdidevashah.mvp_demo.Framework.IPlatformFactory;

public class PlatformFactoryLocator {

	private static IPlatformFactory mPlatformFactory = null;

	private PlatformFactoryLocator() {
	}

	public static IPlatformFactory GetPlatformFactory() {
		return mPlatformFactory;
	}

	public static void SetPlatformFactory(IPlatformFactory platform) {
		mPlatformFactory = platform;
	}
}
