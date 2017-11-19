package com.hm.onlineshop.adapter.vLayout;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.hm.onlineshop.R;
import com.hm.onlineshop.bean.HotBean;
import com.hm.onlineshop.hotDetailActivity;

import java.util.List;

/**
 * Created by H&M on 2017/11/5 01:55:15
 */

public class HotCardviewAdapter extends RecyclerView.Adapter<HotCardviewAdapter.cardViewHolder> {

    private List<HotBean> hotList;
    private Context context;

    public HotCardviewAdapter(List hotList, Context context) {
        this.hotList = hotList;
        this.context = context;
    }


    @Override
    public cardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.cardview2, parent, false);
        cardViewHolder holder = new cardViewHolder(view);
        return holder;
    }


    @Override
    public void onBindViewHolder(cardViewHolder holder, int position) {
        final int j = position;
        holder.tvContent.setText(hotList.get(j).getText());
        holder.tvTitle.setText(hotList.get(j).getTitle());
        Glide.with(context).load(hotList.get(j).getImgPath()).into(holder.ivCover);

        holder.cvContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,hotDetailActivity.class);
                intent.putExtra("hotId",hotList.get(j).getId());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return hotList.size();
    }

    static class cardViewHolder extends RecyclerView.ViewHolder {
        ImageView ivCover;
        TextView tvContent;
        TextView tvTitle;
        CardView cvContent;


        public cardViewHolder(View itemView) {
            super(itemView);
            cvContent = (CardView) itemView.findViewById(R.id.cv_content);
            ivCover = (ImageView) itemView.findViewById(R.id.iv_cover);
            tvTitle = (TextView) itemView.findViewById(R.id.tv_title);
            tvContent = (TextView) itemView.findViewById(R.id.tv_content);
        }
    }



}
