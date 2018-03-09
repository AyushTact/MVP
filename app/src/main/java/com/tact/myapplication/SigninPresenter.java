package com.tact.myapplication;

import android.content.Context;

/**
 * Created by admin on 17/02/18.
 */

public class SigninPresenter {

    private Context context;
    private SigninHelper helper;

    SigninPresenter(Context context, SigninHelper helper){

        this.context = context;
        this.helper = helper;
    }

    public void onClick() {
        String name = helper.getUserName();
        String pass = helper.getPassword();

        if(name.length()==0){
            helper.showToast(R.string.please_enter_username);
            return;
        }

        if(pass.length()==0){
            helper.showToast(R.string.please_enter_password);
            return;
        }

        helper.showToast(R.string.success);

    }
}
