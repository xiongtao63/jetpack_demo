package com.xiangxue.puremusic.ui.base;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import com.xiangxue.puremusic.App;
import com.xiangxue.puremusic.callback.SharedViewModel;

/**
 * 所有Fragment的父类
 */
public class BaseFragment extends Fragment {

    private AppCompatActivity mActivity;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mActivity = (AppCompatActivity) context;
    }

    public boolean isDebug() {
        return mActivity.getApplicationContext().getApplicationInfo() != null &&
                (mActivity.getApplicationContext().getApplicationInfo().flags & ApplicationInfo.FLAG_DEBUGGABLE) != 0;
    }

    public void showLongToast(String text) {
        Toast.makeText(mActivity.getApplicationContext(), text, Toast.LENGTH_LONG).show();
    }

    public void showShortToast(String text) {
        Toast.makeText(mActivity.getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }

    public void showLongToast(int stringRes) {
        showLongToast(mActivity.getApplicationContext().getString(stringRes));
    }

    public void showShortToast(int stringRes) {
        showShortToast(mActivity.getApplicationContext().getString(stringRes));
    }

    protected ViewModelProvider getAppViewModelProvider() {
        return ((App) mActivity.getApplicationContext()).getAppViewModelProvider(mActivity);
    }

    protected ViewModelProvider getFragmentViewModelProvider(Fragment fragment) {
        return new ViewModelProvider(fragment, fragment.getDefaultViewModelProviderFactory());
    }

    protected ViewModelProvider getActivityViewModelProvider(AppCompatActivity activity) {
        return new ViewModelProvider(activity, activity.getDefaultViewModelProviderFactory());
    }

    // 导航到那里去
    protected NavController nav() {
        return NavHostFragment.findNavController(this);
    }

    /*public SharedViewModel getSharedViewModel() {
        return mSharedViewModel;
    }*/

}
