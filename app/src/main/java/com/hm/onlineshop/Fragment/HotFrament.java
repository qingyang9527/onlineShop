package com.hm.onlineshop.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hm.onlineshop.R;
import com.hm.onlineshop.adapter.vLayout.HotCardviewAdapter;
import com.hm.onlineshop.bean.HotBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 清扬 on 2017/7/9.
 */

public class HotFrament extends Fragment {

    private HotCardviewAdapter hotCardviewAdapter;
    private RecyclerView mRecyclerView;
    private List<HotBean> hotList = new ArrayList<>();
    private String imgPath="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1505470629546&di=194a9a92bfcb7754c5e4d19ff1515355&imgtype=0&src=http%3A%2F%2Fpics.jiancai.com%2Fimgextra%2Fimg01%2F656928666%2Fi1%2FT2_IffXdxaXXXXXXXX_%2521%2521656928666.jpg";
    public boolean isVisible;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_hot,container,false);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView= (RecyclerView) view.findViewById(R.id.hot_recycler_view);
        hotCardviewAdapter=new HotCardviewAdapter(hotList,getContext());
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(hotCardviewAdapter);

        return view;
    }
    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (getUserVisibleHint()){
            isVisible=true;
            initView();
        }else {
            isVisible=false;
            onVisible();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if (getUserVisibleHint()){
            initView();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    public void onVisible() {
        initView();
    }

    private void initView() {
        for (int i = 0; i < 5; i++) {
             hotList.add(new HotBean(1,imgPath,"标题"+i,"内容"+i,"描述"+i,null));
        }
    }
}
