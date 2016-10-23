package com.luciofm.presentation.bolivia.activity;

import com.luciofm.presentation.bolivia.R;
import com.luciofm.presentation.bolivia.fragment.ActivityTransitionFragment;
import com.luciofm.presentation.bolivia.fragment.AwesomeFragment;
import com.luciofm.presentation.bolivia.fragment.BaseFragment;
import com.luciofm.presentation.bolivia.fragment.HelloFragment;
import com.luciofm.presentation.bolivia.fragment.IntroFragment;
import com.luciofm.presentation.bolivia.fragment.LayoutTransitionFragment;
import com.luciofm.presentation.bolivia.fragment.MoreTransitionManagerFragment;
import com.luciofm.presentation.bolivia.fragment.MoviesFragment;
import com.luciofm.presentation.bolivia.fragment.MyselfFragment;
import com.luciofm.presentation.bolivia.fragment.QuesionsFragment;
import com.luciofm.presentation.bolivia.fragment.SceneFragment;
import com.luciofm.presentation.bolivia.fragment.SlackFragment;
import com.luciofm.presentation.bolivia.fragment.TransitionManagerFragment;
import com.luciofm.presentation.bolivia.fragment.WorkFragment;

import java.util.ArrayList;

public class FirstActivity extends BaseActivity {

    @Override
    ArrayList<Class<? extends BaseFragment>> getFragmentsList() {
        ArrayList<Class<? extends BaseFragment>> fragments = new ArrayList<>();
        fragments.add(HelloFragment.class);
        fragments.add(MyselfFragment.class);
        fragments.add(WorkFragment.class);
        fragments.add(IntroFragment.class);
        fragments.add(LayoutTransitionFragment.class);
        fragments.add(TransitionManagerFragment.class);
        fragments.add(MoreTransitionManagerFragment.class);
        fragments.add(SceneFragment.class);
        fragments.add(ActivityTransitionFragment.class);
        fragments.add(MoviesFragment.class);
        fragments.add(AwesomeFragment.class);
        fragments.add(QuesionsFragment.class);
        return fragments;
    }

    @Override
    int getContentViewId() {
        return R.layout.root;
    }

    @Override
    int getFragmentContainerId() {
        return R.id.fragmentContainer;
    }
}
