package com.xiangxue.puremusic;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import com.xiangxue.puremusic.databinding.ActivityMainBinding;
import com.xiangxue.puremusic.ridge.state.MainActivityViewModel;
import com.xiangxue.puremusic.ui.base.BaseActivity;

// 主页  管理者
public class MainActivity extends BaseActivity {

    ActivityMainBinding mainBinding;
    MainActivityViewModel mainActivityViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainActivityViewModel = getActivityViewModelProvider(this).get(MainActivityViewModel.class);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mainBinding.setLifecycleOwner(this);
        mainBinding.setVm(mainActivityViewModel);

        // mainActivityViewModel 的 变化 先暂停
       /* mainActivityViewModel.allowDrawerOpen.observe(this, new Observer<Boolean>() {
            @Override
            public void onChanged(Boolean aBoolean) {
                // 需求
            }
        });*/

       mSharedViewModel.closeSlidePanelIfExpanded.observe(this, aBoolean-> {
           // 需求
       });

       mSharedViewModel.enableSwipeDrawer.observe(this, new Observer<Boolean>() {
           @Override
           public void onChanged(Boolean aBoolean) {

           }
       });
    }
}
