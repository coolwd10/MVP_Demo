package com.example.wdidevashah.mvp_demo.Platform;

import com.example.wdidevashah.mvp_demo.Framework.IMobilePlatformFactory;
import com.example.wdidevashah.mvp_demo.Wrappers.PlatformFactoryLocator;


public class MobilePlatformFactoryLocator {
	
	private static IMobilePlatformFactory mMobilePlatformFactory = null;

	private MobilePlatformFactoryLocator() {
	}

	public static IMobilePlatformFactory GetMobilePlatformFactory() {
		return mMobilePlatformFactory;
	}

	public static void SetMobilePlatformFactory(IMobilePlatformFactory mobilePlatform) {
		mMobilePlatformFactory = mobilePlatform;
		PlatformFactoryLocator.SetPlatformFactory(mobilePlatform);
	}
}
