package com.superyu.slidingmenu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ImageView;

import com.superyu.slidingmenu.fragment.MenuLeftFragment;

import slidingmenu01_lib.SlidingMenu;
import slidingmenu01_lib.app.SlidingFragmentActivity;

/**
 * Created by superyu on 2016/9/14.
 */
public class SlidingMenu01 extends SlidingFragmentActivity{

     private ImageView head_container;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sliding_menu01);
        initView();
        initMenu();
        head_container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSlidingMenu().showMenu();
            }
        });
    }

    private void initView(){
        head_container = (ImageView)findViewById(R.id.head_container);
    }
    private void initMenu(){
        Fragment leftMenuFragment = new MenuLeftFragment();
        setBehindContentView(R.layout.left_menu_frame_01);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.id_left_menu_frame, leftMenuFragment).commit();
        SlidingMenu menu = getSlidingMenu();
        menu.setMode(SlidingMenu.LEFT);
        // 设置触摸屏幕的模式
        menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_MARGIN);
        // 设置阴影模式
        //menu.setShadowWidthRes(R.dimen.shadow_width);
        //menu.setShadowDrawable(R.drawable.shadow);
        // 设置滑动菜单视图的宽度
        menu.setBehindOffsetRes(R.dimen.slidingmenu_offset);
        //menu.setBehindWidth()
        // 设置渐入渐出效果的值
        menu.setFadeDegree(0.35f);

    }

}
