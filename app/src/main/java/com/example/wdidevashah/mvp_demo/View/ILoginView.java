package com.example.wdidevashah.mvp_demo.View;

import com.example.wdidevashah.mvp_demo.Mobile.Core.MVP.IView;

public interface ILoginView extends IView {
    public void showProgress();

    public void hideProgress();

    public void setUsernameError(String errorMsg);

    public void setPasswordError(String errorMsg);

    public void navigateToHome();
}
