package bosssoft.com.cn.myapplication;

import android.app.Application;
import android.content.Context;



/**
 * Created by Mr.chen on 2017/4/24.
 */

public class MyApplication extends Application {

    private static MyApplication instance;
    // 全局的上下文对象
    private static Context context;

    public static MyApplication getInstance() {
        return instance;
    }

    public static Context getContext() {
        return context;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        context = this;
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

}
