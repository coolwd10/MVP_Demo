package com.example.wdidevashah.mvp_demo.Mobile.Core.MVP;


import com.example.wdidevashah.mvp_demo.Framework.IObject;

public interface IView extends IObject {
	
	Presenter GetPresenterOrController();
	
	void OnDestroy();

}
