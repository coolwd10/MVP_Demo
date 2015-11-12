

package com.example.wdidevashah.mvp_demo.Presenter;


import com.example.wdidevashah.mvp_demo.Framework.IStringService;
import com.example.wdidevashah.mvp_demo.Mobile.Core.MVP.Presenter;
import com.example.wdidevashah.mvp_demo.View.ILoginView;

public class LoginPresenter extends Presenter {

    public static final String TAG = "LoginPresenter";

    private ILoginView mLoginView;
    private IStringService mStringService;
    public LoginPresenter(ILoginView loginView) {
        super(loginView);
        mLoginView = loginView;
        OnCreate();
    }

    public void OnCreate() {
        super.OnCreate();
        mStringService = mMobilePlatformFactory.CreateStringService();
    }

    public void validateCredentials(String userName, String password) {
        boolean error = false;
        if (mStringService.IsNullOrEmpty(userName)) {
            mLoginView.setUsernameError("Username cannot be empty");
            error = true;
        }
        if (mStringService.IsNullOrEmpty(password)) {
            mLoginView.setPasswordError("Password cannot be empty");
            error = true;
        }
        if (!error) {
            mLoginView.navigateToHome();
        }

    }

    @Override
    public String GetClassName() {
        return TAG;
    }

    @Override
    public void OnDestroy() {
        mLoginView = null;
        mStringService = null;
        super.OnDestroy();
    }


}
