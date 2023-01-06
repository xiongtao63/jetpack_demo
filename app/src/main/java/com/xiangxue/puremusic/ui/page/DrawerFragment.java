package com.xiangxue.puremusic.ui.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.xiangxue.puremusic.R;
import com.xiangxue.puremusic.databinding.FragmentDrawerBinding;
import com.xiangxue.puremusic.ridge.state.DrawerViewModel;
import com.xiangxue.puremusic.ui.base.BaseFragment;

/**
 * 抽屉的 左侧半界面
 */
public class DrawerFragment extends BaseFragment {

    private FragmentDrawerBinding mBinding;
    private DrawerViewModel mDrawerViewModel;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mDrawerViewModel = getFragmentViewModelProvider(this).get(DrawerViewModel.class);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_drawer, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    public class ClickProxy {

        public void logoClick() {
            // Toast.makeText(mActivity, "你能不能不要乱点啊，程序员还在玩命编码中...", Toast.LENGTH_SHORT).show();
        }
    }

}
