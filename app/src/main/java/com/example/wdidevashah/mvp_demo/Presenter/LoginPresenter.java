

package com.example.wdidevashah.mvp_demo.Presenter;


import com.example.wdidevashah.mvp_demo.Login.LoginValidation;
import com.example.wdidevashah.mvp_demo.View.ILoginFinishedListener;
import com.example.wdidevashah.mvp_demo.View.ILoginPresenter;
import com.example.wdidevashah.mvp_demo.View.ILoginValidattion;
import com.example.wdidevashah.mvp_demo.View.ILoginView;

public class LoginPresenter implements ILoginPresenter, ILoginFinishedListener {

    private ILoginView loginView;
    private ILoginValidattion loginInteractor;

    public LoginPresenter(ILoginView loginView) {
        this.loginView = loginView;
        this.loginInteractor = new LoginValidation();
    }

    @Override
    public void validateCredentials(String username, String password) {
        loginView.showProgress();
        loginInteractor.login(username, password, this);
    }

    @Override
    public void onUsernameError() {
        loginView.setUsernameError();
        loginView.hideProgress();
    }

    @Override
    public void onPasswordError() {
        loginView.setPasswordError();
        loginView.hideProgress();
    }

    @Override
    public void onSuccess() {
        loginView.navigateToHome();
    }
}
