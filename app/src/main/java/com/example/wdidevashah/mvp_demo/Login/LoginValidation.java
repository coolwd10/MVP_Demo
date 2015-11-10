package com.example.wdidevashah.mvp_demo.Login;

import android.os.Handler;
import android.text.TextUtils;

import com.example.wdidevashah.mvp_demo.View.ILoginFinishedListener;
import com.example.wdidevashah.mvp_demo.View.ILoginValidattion;

public class LoginValidation implements ILoginValidattion {

    @Override
    public void login(final String username, final String password, final ILoginFinishedListener
            listener) {
        // Mock login. I'm creating a handler to delay the answer a couple of seconds
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean error = false;
                if (TextUtils.isEmpty(username)){
                    listener.onUsernameError();
                    error = true;
                }
                if (TextUtils.isEmpty(password)){
                    listener.onPasswordError();
                    error = true;
                }
                if (!error){
                    listener.onSuccess();
                }
            }
        }, 2000);
    }
}
