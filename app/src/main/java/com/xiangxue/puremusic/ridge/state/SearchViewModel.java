package com.xiangxue.puremusic.ridge.state;

import androidx.databinding.ObservableField;
import androidx.lifecycle.ViewModel;

/**
 * SearchViewModel 是专门为 SearchFragment（搜索界面）服务的
 */
public class SearchViewModel extends ViewModel {

    public final ObservableField<Integer> progress = new ObservableField<>();

}
