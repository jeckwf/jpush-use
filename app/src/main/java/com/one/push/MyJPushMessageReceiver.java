package com.one.push;

import android.content.Context;
import android.util.Log;



import cn.jpush.android.api.JPushMessage;
import cn.jpush.android.service.JPushMessageReceiver;

/**
 * jpush设置结果回调
 */
public class MyJPushMessageReceiver extends JPushMessageReceiver {

    private static final String TAG = "c-test";

//    @Override
//    public void onAliasOperatorResult(Context context, JPushMessage jPushMessage) {
//        super.onAliasOperatorResult(context, jPushMessage);
//        if (jPushMessage.getErrorCode() == 0) {
//            Log.i(TAG, "alias operator success:" + jPushMessage.getAlias());
//        } else {
//            Log.i(TAG, "alias operator failed:" + jPushMessage.getErrorCode());
//            JPushUtil.getInstance().onAliasOperatorResult(context, jPushMessage.getErrorCode());
//        }
//    }

    @Override
    public void onTagOperatorResult(Context context,JPushMessage jPushMessage) {
        Log.i(TAG,"ccc--onTagOperatorResult");
        TagAliasOperatorHelper.getInstance().onTagOperatorResult(context,jPushMessage);
        super.onTagOperatorResult(context, jPushMessage);
    }
    @Override
    public void onCheckTagOperatorResult(Context context,JPushMessage jPushMessage){
        Log.i(TAG,"ccc--onCheckTagOperatorResult");
        TagAliasOperatorHelper.getInstance().onCheckTagOperatorResult(context,jPushMessage);
        super.onCheckTagOperatorResult(context, jPushMessage);
    }
    @Override
    public void onAliasOperatorResult(Context context, JPushMessage jPushMessage) {
        Log.i(TAG,"ccc--onAliasOperatorResult");
        TagAliasOperatorHelper.getInstance().onAliasOperatorResult(context,jPushMessage);
        super.onAliasOperatorResult(context, jPushMessage);
    }

    @Override
    public void onMobileNumberOperatorResult(Context context, JPushMessage jPushMessage) {
        Log.i(TAG,"ccco--nMobileNumberOperatorResult");
        TagAliasOperatorHelper.getInstance().onMobileNumberOperatorResult(context,jPushMessage);
        super.onMobileNumberOperatorResult(context, jPushMessage);
    }
}
