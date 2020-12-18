package com.example.day04.presenter;


import com.example.day04.contract.MainContract;
import com.example.day04.model.MainModelImpl;
import com.example.day04.model.UserBean;
import com.example.mvplibrary.base.BasePresenter;
import com.example.mvplibrary.utils.net.INetCallBack;

public class MainPresenterImpl extends BasePresenter<MainContract.IMainView, MainContract.IMainModel> implements MainContract.IMainPresenter{


    @Override
    public void login(String name,String password) {

//        URL就在P层确定,不要从Activity中传递过来
        iModel.getLoginData("", new INetCallBack<UserBean>() {
            @Override
            public void onSuccess(UserBean userBean) {
                iView.getData(userBean);
            }
            @Override
            public void onFail(String err) {
            }
        });
    }
    @Override
    public void loginResult(String result) {

    }

    @Override
    public MainContract.IMainModel getiModel() {
        return new MainModelImpl(this);
    }
}
