package com.example.wdidevashah.mvp_demo.Mobile.Core.MVP;

import com.example.wdidevashah.mvp_demo.Framework.IMobilePlatformFactory;
import com.example.wdidevashah.mvp_demo.Framework.IObject;
import com.example.wdidevashah.mvp_demo.Platform.MobilePlatformFactoryLocator;

public abstract class Presenter implements IObject {

	protected IView mView;
	protected IMobilePlatformFactory mMobilePlatformFactory;

	protected Presenter mParentPresenter;

	public Presenter(IView view) {
		SetView(view);
	}

	public void OnCreate() {
		mMobilePlatformFactory = MobilePlatformFactoryLocator.GetMobilePlatformFactory();
	}

	public void SetView(IView view) {
		this.mView = view;
	}

	public void OnDestroy() {
		mParentPresenter = null;
		mMobilePlatformFactory = null;
	}
}
