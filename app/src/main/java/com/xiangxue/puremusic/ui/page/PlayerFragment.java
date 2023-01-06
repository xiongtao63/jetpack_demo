package com.xiangxue.puremusic.ui.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.xiangxue.puremusic.ridge.state.PlayerViewModel;
import com.xiangxue.puremusic.ui.base.BaseFragment;

/**
 * 底部播放条
 */
public class PlayerFragment extends BaseFragment {

    private PlayerViewModel playerViewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        playerViewModel = getFragmentViewModelProvider(this).get(PlayerViewModel.class);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    public class ClickProxy {

        public void playerMode() {

        }

        public void previous() {

        }

        public void next() {

        }

    }

    public class EventHandler implements SeekBar.OnSeekBarChangeListener {

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    }
}
