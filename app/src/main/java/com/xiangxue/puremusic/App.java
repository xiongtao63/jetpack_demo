package com.xiangxue.puremusic;

import android.app.Activity;
import android.app.Application;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;

import com.xiangxue.architecture.utils.Utils;

/**
 * 整个项目的 Application
 */
public class App extends Application implements ViewModelStoreOwner {

    private ViewModelStore mAppViewModelStore;
    private ViewModelProvider.Factory mFactory;


    @Override
    public void onCreate() {
        super.onCreate();

        Utils.init(this);
        mAppViewModelStore = new ViewModelStore();
    }

    public ViewModelProvider getAppViewModelProvider(Activity activity) {
        return new ViewModelProvider((App) activity.getApplicationContext(),
                ((App) activity.getApplicationContext()).getAppFactory(activity));
    }

    private ViewModelProvider.Factory getAppFactory(Activity activity) {
        Application application = checkApplication(activity);
        if (mFactory == null) {
            mFactory = ViewModelProvider.AndroidViewModelFactory.getInstance(application);
        }
        return mFactory;
    }

    private Application checkApplication(Activity activity) {
        Application application = activity.getApplication();
        if (application == null) {
            throw new IllegalStateException("Your activity/fragment is not yet attached to "
                    + "Application. You can't request ViewModel before onCreate call.");
        }
        return application;
    }

    private Activity checkActivity(Fragment fragment) {
        Activity activity = fragment.getActivity();
        if (activity == null) {
            throw new IllegalStateException("Can't create ViewModelProvider for detached fragment");
        }
        return activity;
    }

    // TODO 暴露出去
    @NonNull
    @Override
    public ViewModelStore getViewModelStore() {
        return mAppViewModelStore;
    }
}
