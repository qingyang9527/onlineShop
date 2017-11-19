package com.hm.onlineshop.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v7.widget.TintTypedArray;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.hm.onlineshop.R;

/**
 * Created by 清扬 on 2017/7/10.
 */

public class MyToolbar extends Toolbar {

    private LayoutInflater mInflater;
    private View view;
    private TextView mTextTitle;
    private EditText searchEditText;
    private ImageButton rightImageButton;

    public MyToolbar(Context context) {
        this(context, null);
    }

    public MyToolbar(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyToolbar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
        setContentInsetsRelative(10,10);
        if(attrs!=null) {
            final TintTypedArray a = TintTypedArray.obtainStyledAttributes(getContext(), attrs, R.styleable.MyToolbar, defStyleAttr, 0);
            final Drawable rightIcon = a.getDrawable(R.styleable.MyToolbar_rightImageButton);
            if (rightIcon != null) {
                setRightImageButton(rightIcon);
            }

            boolean isShowSearchView=a.getBoolean(R.styleable.MyToolbar_isShowSearchView,false);
            if (isShowSearchView==true){
                showSearchView();
                hideTitleView();
            }
//            CharSequence rightButtonText = a.getText(R.styleable.MyToolbar_rightButtonText);
//            if(rightButtonText !=null){
//                setRightButtonText(rightButtonText);
//            }
            a.recycle();
        }
    }

//    private void setRightButtonText(CharSequence rightButtonText) {
//        if (rightI!=null){
//            rightImageButton.setImageDrawable(icon);
//            rightImageButton.setVisibility(VISIBLE);
//        }
//    }



    private void initView() {
        if(view==null) {
            mInflater = LayoutInflater.from(getContext());
            view = mInflater.inflate(R.layout.toolbar,null);
            mTextTitle= (TextView) view.findViewById(R.id.toolbar_title);
            searchEditText= (EditText) view.findViewById(R.id.toolbar_searchview);
            rightImageButton= (ImageButton) view.findViewById(R.id.toolbar_rightButton);
            LayoutParams lp =  new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, Gravity.CENTER_HORIZONTAL);
            addView(view, lp);
        }
    }

    public void setRightImageButton(Drawable icon){
        if (rightImageButton!=null){
            rightImageButton.setImageDrawable(icon);
            rightImageButton.setVisibility(VISIBLE);
        }
    }

    public void setRightImageButtonOnClickListener(OnClickListener li){
        rightImageButton.setOnClickListener(li);
    }

    @Override
    public void setTitle(int resId) {
        setTitle(getContext().getText(resId));
    }

    @Override
    public void setTitle(CharSequence title){
        initView();
        if (mTextTitle!=null){
            mTextTitle.setText(title);
            showTitleView();
        }
    }

    public void showSearchView(){
        if (searchEditText!=null){
            searchEditText.setVisibility(VISIBLE);
        }
    }

    public void hideSearchView(){
        if (searchEditText!=null){
            searchEditText.setVisibility(GONE);
        }
    }

    public void showTitleView(){
        if (mTextTitle!=null){
            mTextTitle.setVisibility(VISIBLE);
        }
    }

    public void hideTitleView(){
        if (mTextTitle!=null){
            mTextTitle.setVisibility(GONE);
        }
    }


}
