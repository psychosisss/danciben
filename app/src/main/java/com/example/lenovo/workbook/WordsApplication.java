package com.example.lenovo.workbook;

import android.app.Application;
import android.content.Context;


/**
 * Created by lenovo on 2018/4/10.
 */

public class WordsApplication extends Application {
    private static Context context;
    public static Context getContext(){
        return WordsApplication.context;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        WordsApplication.context=getApplicationContext();
    }
}