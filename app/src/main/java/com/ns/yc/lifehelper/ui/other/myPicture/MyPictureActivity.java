package com.ns.yc.lifehelper.ui.other.myPicture;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.ns.yc.lifehelper.R;
import com.ns.yc.lifehelper.base.BaseActivity;
import com.ns.yc.lifehelper.ui.other.myPicture.view.MyPicBeautifulActivity;
import com.ns.yc.lifehelper.ui.other.myPicture.view.MyPicNiceActivity;
import com.ns.yc.lifehelper.ui.other.myPicture.view.MyPicPileActivity;

import butterknife.Bind;


/**
 * ================================================
 * 作    者：杨充
 * 版    本：1.0
 * 创建日期：2017/8/30
 * 描    述：图片欣赏页面
 * 修订历史：
 * ================================================
 */
public class MyPictureActivity extends BaseActivity implements View.OnClickListener {

    @Bind(R.id.ll_title_menu)
    FrameLayout llTitleMenu;
    @Bind(R.id.ll_search)
    FrameLayout llSearch;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.btn)
    Button btn;
    @Bind(R.id.btn2)
    Button btn2;
    @Bind(R.id.btn3)
    Button btn3;
    @Bind(R.id.toolbar_title)
    TextView toolbarTitle;

    @Override
    public int getContentView() {
        return R.layout.activity_my_pic_main;
    }

    @Override
    public void initView() {
        initToolBar();
    }

    private void initToolBar() {
        llSearch.setVisibility(View.VISIBLE);
        toolbarTitle.setText("图片欣赏");
    }

    @Override
    public void initListener() {
        llSearch.setOnClickListener(this);
        llTitleMenu.setOnClickListener(this);
        btn.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    @Override
    public void initData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ll_search:

                break;
            case R.id.ll_title_menu:
                finish();
                break;
            case R.id.btn:
                startActivity(MyPicPileActivity.class);
                break;
            case R.id.btn2:
                startActivity(MyPicNiceActivity.class);
                break;
            case R.id.btn3:
                startActivity(MyPicBeautifulActivity.class);
                break;
        }
    }
}