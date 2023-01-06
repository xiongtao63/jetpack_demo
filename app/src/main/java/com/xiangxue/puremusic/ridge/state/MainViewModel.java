package com.xiangxue.puremusic.ridge.state;

import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.lifecycle.ViewModel;

/**
 * 首页Fragment 的 MainViewModel
 */
public class MainViewModel extends ViewModel {

    // MainFragment初始化页面的标记 例如：“最近播放”  的记录
    public final ObservableBoolean initTabAndPage = new ObservableBoolean();

    // MainFragment “最佳实践” 里面的 WebView需要加载的网页链接路径
    public final ObservableField<String> pageAssetPath = new ObservableField<>();

}
