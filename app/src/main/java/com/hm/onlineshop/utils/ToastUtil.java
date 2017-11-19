package com.hm.onlineshop.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by H&M on 2017/8/11 14:35:51
 */

public class ToastUtil {

    private static ToastUtil instace;

    public ToastUtil() {
    }

    public synchronized static ToastUtil getInstace(){
        if (instace==null){
            instace=new ToastUtil();
        }
        return instace;
    }

    /**
     * 短时间显示toast
     * @param context
     * @param msg
     */
    public void shortShowToast(Context context,String msg){
        if (msg==null){
            return;
        }
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }


    /**
     * 长时间显示toast
     * @param context
     * @param msg
     */
    public void LongShowToast(Context context,String msg){
        if (msg==null){
            return;
        }
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
    }


    /**
     * 传入资源id显示toast
     * @param context
     * @param resId
     * @param msg
     */
    public void showToast(Context context,int resId,String msg){
        Toast.makeText(context, resId, Toast.LENGTH_SHORT).show();
    }
}
