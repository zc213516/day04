package com.example.day04.view;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import com.example.day04.R;
import com.example.day04.contract.MainContract;
import com.example.day04.model.UserBean;
import com.example.day04.presenter.MainPresenterImpl;
import com.example.mvplibrary.base.BaseActivity;


public class LoginActivity extends BaseActivity<MainPresenterImpl> implements MainContract.IMainView {


    private EditText editTextTextPersonName;
    private EditText editTextTextPassword;
    @Override
    protected void initData() {
        presenter.login(getUserName(),getPassword());
    }
    @Override
    protected void initView() {
        editTextTextPersonName.findViewById(R.id.editTextTextPersonName);
        editTextTextPassword.findViewById(R.id.editTextTextPassword);

    }

    @Override
    protected int getLayoutID() { return R.layout.activity_main; }

    @Override
    public MainPresenterImpl add() {
        return new MainPresenterImpl();
    }

    public void loginButton(View view) {
        if(!TextUtils.isEmpty(getUserName()) && !TextUtils.isEmpty(getPassword())){
            presenter.login(getUserName(),getPassword());
        }
    }

    @Override
    public String getUserName() {
        return editTextTextPersonName.getText().toString();
    }

    @Override
    public String getPassword() {
        return editTextTextPassword.getText().toString();
    }

    @Override
    public void getData(UserBean string) {}

}