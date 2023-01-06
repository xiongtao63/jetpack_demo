package com.xiangxue.puremusic.ridge.state;

import androidx.databinding.ObservableField;
import androidx.lifecycle.ViewModel;

/**
 * TODO tip：每个页面都要单独准备一个 stateViewModel，
 */
public class DrawerViewModel extends ViewModel {

    public final ObservableField<String> loadPage = new ObservableField<>();

}
