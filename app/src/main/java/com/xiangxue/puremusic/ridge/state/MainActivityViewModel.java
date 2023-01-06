package com.xiangxue.puremusic.ridge.state;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * MainActivityViewModel -- activity_main.xml
 */
public class MainActivityViewModel extends ViewModel {

    // 首页需要记录抽屉布局的情况 （响应的效果，都让 抽屉控件干了）
    public final MutableLiveData<Boolean> openDrawer = new MutableLiveData<>();

    // （响应的效果，都让 抽屉控件干了）
    public final MutableLiveData<Boolean> allowDrawerOpen = new MutableLiveData<>();

    // 构造代码块
    {
        allowDrawerOpen.setValue(true);
    }

}
