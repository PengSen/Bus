package com.ob.bus.util;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
public class ScreenUtil {


	/**
	 * 获取手机屏幕的宽度
	 */
	public static int getScreenWidth(Context context) {
		Resources resources = context.getResources();
		DisplayMetrics dm = resources.getDisplayMetrics();
		return dm.widthPixels;
	}

	/**
	 * 获取手机屏幕的高度
	 */
	public static int getScreenHeight(Context context) {
		Resources resources = context.getResources();
		DisplayMetrics dm = resources.getDisplayMetrics();
		return dm.heightPixels;
	}

	/**
	 * 根据手机分辨率将dp转为px单位
	 */
	public static int dip2px(Context context, float dpValue) {
		final float scale = context.getResources()
				.getDisplayMetrics().density;
		return (int) (dpValue * scale + 0.5f);
	}

	/**
	 * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
	 */
	public static int px2dip(Context context, float pxValue) {
		final float scale = context.getResources()
				.getDisplayMetrics().density;
		return (int) (pxValue / scale + 0.5f);
	}
	/**
	 * convert px to its equivalent sp
	 *
	 * 将px转换为sp
	 */
	public static int px2sp(Context context, float pxValue) {
		final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
		return (int) (pxValue / fontScale + 0.5f);
	}


	/**
	 * convert sp to its equivalent px
	 *
	 * 将sp转换为px
	 */
	public static int sp2px(Context context, float spValue) {
		final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
		return (int) (spValue * fontScale + 0.5f);
	}
}