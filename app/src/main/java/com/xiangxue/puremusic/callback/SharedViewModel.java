package com.xiangxue.puremusic.callback;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * SharedViewModel的职责是用于 页面通信的
 */
public class SharedViewModel extends ViewModel {

    public final MutableLiveData<Boolean> closeSlidePanelIfExpanded = new MutableLiveData<>(); // 点击“播放条”弹上来

    public final MutableLiveData<Boolean> enableSwipeDrawer = new MutableLiveData<>(); // 开启和关闭 卡片相关的状态，如果发生改变 会和 allowDrawerOpen 挂钩
}
