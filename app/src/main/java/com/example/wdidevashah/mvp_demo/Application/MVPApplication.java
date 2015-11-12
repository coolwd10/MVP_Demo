package com.example.wdidevashah.mvp_demo.Application;

import android.app.Application;

import com.example.wdidevashah.mvp_demo.Platform.PlatformFactory;
import com.example.wdidevashah.mvp_demo.Platform.MobilePlatformFactoryLocator;

public class MVPApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        init();
    }

    private void init() {
        MobilePlatformFactoryLocator
                .SetMobilePlatformFactory(new PlatformFactory(this));
    }

}
