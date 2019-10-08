package com.example.rpl2016_16.login;

import android.app.Application;

import com.androidnetworking.AndroidNetworking;

/**
 * Created by RPL2016-16 on 10/8/2019.
 */

public class App extends Application {
    @Override
    public  void onCreate(){
        super.onCreate();
        AndroidNetworking.initialize( this );
    }
}
