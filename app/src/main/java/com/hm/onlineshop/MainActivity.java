package com.hm.onlineshop;

import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TextView;

import com.hm.onlineshop.Fragment.CartFrament;
import com.hm.onlineshop.Fragment.CategoryFrament;
import com.hm.onlineshop.Fragment.HomeFragment;
import com.hm.onlineshop.Fragment.HotFrament;
import com.hm.onlineshop.Fragment.MineFrament;
import com.hm.onlineshop.bean.Tab;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private FragmentTabHost tabhost;

    private LayoutInflater mInflater;

    private List<Tab> mTabs=new ArrayList<>(5);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabhost= (FragmentTabHost) findViewById(android.R.id.tabhost);
        mInflater=LayoutInflater.from(this);
        tabhost.setup(this,getSupportFragmentManager(),R.id.realtabcontent);
        initTab();
    }

    private void initTab() {
        Tab tab_home=new Tab(R.string.home,R.drawable.tab_home_selector, HomeFragment.class);
        Tab tab_category=new Tab(R.string.category,R.drawable.tab_cate_selector, CategoryFrament.class);
        Tab tab_hot=new Tab(R.string.hot,R.drawable.tab_hot_selector, HotFrament.class);
        Tab tab_cart=new Tab(R.string.cart,R.drawable.tab_cart_selector, CartFrament.class);
        Tab tab_mine=new Tab(R.string.mine,R.drawable.tab_mine_selector, MineFrament.class);

        mTabs.add(tab_home);
        mTabs.add(tab_hot);
        mTabs.add(tab_category);
        mTabs.add(tab_cart);
        mTabs.add(tab_mine);

        for (Tab tab:mTabs
             ) {
            TabHost.TabSpec tabSpec = tabhost.newTabSpec(getString(tab.getTitle()));
            tabSpec.setIndicator(buildIndicator(tab));
            tabhost.addTab(tabSpec,tab.getFragment(),null);
        }
        tabhost.getTabWidget().setShowDividers(LinearLayout.SHOW_DIVIDER_NONE);
        tabhost.setCurrentTab(0);
    }

    private View buildIndicator(Tab tab) {
        View view = mInflater.inflate(R.layout.tab_item_view, null);
        ImageView img= (ImageView) view.findViewById(R.id.imageview);
        TextView tvw= (TextView) view.findViewById(R.id.textview);
        img.setImageResource(tab.getIcon());
        tvw.setText(tab.getTitle());
        return view;
    }

}
