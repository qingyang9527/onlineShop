package com.hm.onlineshop.utils;

import com.hm.onlineshop.R;

/**
 * Created by H&M on 2017/11/5 00:05:52
 */

public interface VLayoutConfig {
    //不同item必须不同的viewtype
    int SEARCH_VIEW_TYPE = 1;
    int BANNER_VIEW_TYPE = 1;
    int MENU_VIEW_TYPE = 2;
    int NEWS_VIEW_TYPE = 3;
    int TITLE_VIEW_TYPE = 4;
    int GRID_VIEW_TYPE = 5;


    int[] IMG_URLS = {R.mipmap.ic_tian_mao, R.mipmap.ic_ju_hua_suan, R.mipmap.ic_tian_mao_guoji, R.mipmap.ic_waimai,  R.mipmap.ic_classify};
    String[] ITEM_NAMES = {"天猫", "聚划算", "天猫国际", "分类","测试"};
    int[] GRID_URL = {R.mipmap.flashsale1, R.mipmap.flashsale2};
    int[] ITEM_URL = {R.mipmap.item1, R.mipmap.item2};
}
