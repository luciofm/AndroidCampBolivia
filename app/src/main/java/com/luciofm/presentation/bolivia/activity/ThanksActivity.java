package com.luciofm.presentation.bolivia.activity;

import android.os.Bundle;

import com.luciofm.presentation.bolivia.R;
import com.luciofm.presentation.bolivia.fragment.BaseFragment;
import com.luciofm.presentation.bolivia.transitions.Pop;

import java.util.ArrayList;

public class ThanksActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setEnterTransition(new Pop(false).addTarget(R.id.text1));
    }

    @Override
    ArrayList<Class<? extends BaseFragment>> getFragmentsList() {
        return null;
    }

    @Override
    int getContentViewId() {
        return R.layout.activity_thanks;
    }

    @Override
    int getFragmentContainerId() {
        return 0;
    }
}
