package com.xiangxue.puremusic.ui.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.xiangxue.puremusic.R;

public class MainFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container,false);
        return view;
    }

    public class ClickProxy {

        // 当在首页点击 “菜单” 的时候，直接导航到 ---> 菜单的Fragment界面
        public void openMenu() {

        }

        // 当在首页点击 “搜索图标” 的时候，直接导航到 ---> 搜索的Fragment界面
        public void search() {

        }
    }
}
