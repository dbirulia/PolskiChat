package com.birulia.polskichat;

import android.app.Application;

import com.birulia.polskichat.models.Message;
import com.parse.Parse;
import com.parse.ParseObject;
import com.parse.interceptors.ParseLogInterceptor;

public class PolskiChatApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models here

        ParseObject.registerSubclass(Message.class);


        // set applicationId and server based on the values in the Heroku settings.
        // any network interceptors must be added with the Configuration Builder given this syntax
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("vvDADNfLn8ofOS7S2mmbKNOOr7RzLTCezw2qehBb") // should correspond to APP_ID env variable
                .clientKey("vsdktyNXuvxwctSVoI7ybW6EFsKTInndaB84XlHN")
                .addNetworkInterceptor(new ParseLogInterceptor())
                .build());
    }
}