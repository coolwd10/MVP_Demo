
package com.example.wdidevashah.mvp_demo.Login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.example.wdidevashah.mvp_demo.Presenter.LoginPresenter;
import com.example.wdidevashah.mvp_demo.R;
import com.example.wdidevashah.mvp_demo.View.ILoginPresenter;
import com.example.wdidevashah.mvp_demo.View.ILoginView;
import com.example.wdidevashah.mvp_demo.main.MainActivity;


public class LoginActivity extends Activity implements ILoginView, View.OnClickListener {

    private ProgressBar mProgressBar;
    private EditText mUsername;
    private EditText mPassword;
    private ILoginPresenter mLogingPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mProgressBar = (ProgressBar) findViewById(R.id.progress);
        mUsername = (EditText) findViewById(R.id.username);
        mPassword = (EditText) findViewById(R.id.password);
        findViewById(R.id.button).setOnClickListener(this);

        mLogingPresenter = new LoginPresenter(this);
    }

    @Override
    public void showProgress() {
        mProgressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        mProgressBar.setVisibility(View.GONE);
    }

    @Override
    public void setUsernameError() {
        mUsername.setError(getString(R.string.username_error));
    }

    @Override
    public void setPasswordError() {
        mPassword.setError(getString(R.string.password_error));
    }

    @Override
    public void navigateToHome() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    @Override
    public void onClick(View v) {
        mLogingPresenter.validateCredentials(mUsername.getText().toString(), mPassword.getText().toString());
    }
}
