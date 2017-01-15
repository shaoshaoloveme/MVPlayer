package zhbj.itheima.com.phonevidao.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2017/1/15.
 * 类名:BaseFragment
 * 创建者:黄潇宇
 * 创建时间:2017/1/1523:35
 * 更新者:$Author$
 * 更新时间:2017/1/15
 * 描述:${TODO}
 */

public abstract class BaseFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
        //View rootView = inflater.inflate(getLayoutResId(),null);
        //return rootView;
    }

    public abstract int  getLayoutResId();
}
