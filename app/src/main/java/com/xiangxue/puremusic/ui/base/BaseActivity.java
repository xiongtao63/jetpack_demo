package com.xiangxue.puremusic.ui.base;

import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.xiangxue.architecture.utils.AdaptScreenUtils;
import com.xiangxue.architecture.utils.BarUtils;
import com.xiangxue.architecture.utils.ScreenUtils;
import com.xiangxue.puremusic.App;
import com.xiangxue.puremusic.callback.SharedViewModel;

/**
 * 所有Activity 的基类
 */
public class BaseActivity extends AppCompatActivity {

    // 贯穿整个项目的
    protected SharedViewModel mSharedViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        BarUtils.setStatusBarColor(this, Color.TRANSPARENT);
        BarUtils.setStatusBarLightMode(this, true);

        mSharedViewModel = getAppViewModelProvider().get(SharedViewModel.class);

        // 准备：lifecycle
        getLifecycle().addObserver(null);
    }

    public boolean isDebug() {
        return getApplicationContext().getApplicationInfo() != null &&
                (getApplicationContext().getApplicationInfo().flags & ApplicationInfo.FLAG_DEBUGGABLE) != 0;
    }

    @Override
    public Resources getResources() {
        if (ScreenUtils.isPortrait()) {
            return AdaptScreenUtils.adaptWidth(super.getResources(), 360);
        } else {
            return AdaptScreenUtils.adaptHeight(super.getResources(), 640);
        }
    }

    public void showLongToast(String text) {
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
    }

    public void showShortToast(String text) {
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }

    // 2020 用法 ViewModelProvider
    protected ViewModelProvider getAppViewModelProvider() {
        return ((App) getApplicationContext()).getAppViewModelProvider(this);
    }

    protected ViewModelProvider getActivityViewModelProvider(AppCompatActivity activity) {
        return new ViewModelProvider(activity, activity.getDefaultViewModelProviderFactory());
    }
}
