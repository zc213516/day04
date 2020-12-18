package com.example.day04.model;


import com.example.day04.contract.MainContract;
import com.example.mvplibrary.utils.net.INetCallBack;
import com.example.mvplibrary.utils.net.RetrofitUtils;

public class MainModelImpl implements MainContract.IMainModel {

    private MainContract.IMainPresenter presenter;

    public MainModelImpl(MainContract.IMainPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public <T> void getLoginData(String url , INetCallBack<T> callBack) {
        presenter.loginResult("登录成功了");
        RetrofitUtils.getInstance().get(url,callBack);

    }
}
