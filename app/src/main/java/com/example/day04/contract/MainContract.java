package com.example.day04.contract;


import com.example.day04.model.UserBean;
import com.example.mvplibrary.base.BaseModel;
import com.example.mvplibrary.base.BaseView;
import com.example.mvplibrary.utils.net.INetCallBack;

public class MainContract {
    public interface IMainModel extends BaseModel {
        <T> void getLoginData(String url, INetCallBack<T> callBack);
    }
    public  interface IMainPresenter {
        void login(String name,String password);
        void loginResult(String result);
    }
    public interface IMainView extends BaseView {

        String getUserName();
        String getPassword();
        void getData(UserBean string);
    }
}
