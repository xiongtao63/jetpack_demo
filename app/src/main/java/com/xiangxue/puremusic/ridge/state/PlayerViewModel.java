package com.xiangxue.puremusic.ridge.state;

import android.graphics.drawable.Drawable;

import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;
import androidx.lifecycle.ViewModel;

public class PlayerViewModel extends ViewModel {

    // 歌曲名称
    public final ObservableField<String> title = new ObservableField<>();

    // 歌手
    public final ObservableField<String> artist = new ObservableField<>();

    // 歌曲图片的地址
    public final ObservableField<String> coverImg = new ObservableField<>();

    // 歌曲正方形图片
    public final ObservableField<Drawable> placeHolder = new ObservableField<>();

    // 歌曲的总时长，会显示在拖动条后面
    public final ObservableInt maxSeekDuration = new ObservableInt();

    // 当前拖动条的进度值
    public final ObservableInt currentSeekPosition = new ObservableInt();

    // 播放按钮，状态的改变
    public final ObservableBoolean isPlaying = new ObservableBoolean();

}
