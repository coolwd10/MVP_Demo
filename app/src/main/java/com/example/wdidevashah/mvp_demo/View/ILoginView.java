package com.example.wdidevashah.mvp_demo.View;

public interface ILoginView {
    public void showProgress();

    public void hideProgress();

    public void setUsernameError();

    public void setPasswordError();

    public void navigateToHome();
}
