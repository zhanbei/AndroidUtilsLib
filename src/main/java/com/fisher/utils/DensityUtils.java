package com.fisher.utils;

import android.content.Context;
import android.util.TypedValue;

/**
 * `Created` by Fisher at 23:06 on 2017-02-20.
 *
 * DensityUtils.
 * <p>
 * dp * mDensity = px
 * so * mScaledDensity = px
 */
public class DensityUtils {

	/**
	 * Get screen width in pixels.
	 *
	 * @param context Context instance.
	 * @return Screen Width in pixels.
	 */
	public static int getScreenWidth(Context context) {
		return context.getResources().getDisplayMetrics().widthPixels;
	}

	/**
	 * Get screen height in pixels.
	 *
	 * @param context Context instance.
	 * @return Screen Height in pixels.
	 */
	public static int getScreenHeight(Context context) {
		return context.getResources().getDisplayMetrics().heightPixels;
	}

	/**
	 * Get system status bar height in pixels.
	 *
	 * @param context Context instance.
	 * @return System status bar height in pixels.
	 */
	public static int getSystemStatusBarHeight(Context context) {
		int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
		if (resourceId > 0) {
			return context.getResources().getDimensionPixelSize(resourceId);
		}
		return 0;
	}

	public static int fnDp2px(Context context, float dpVal) {
		return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dpVal, context.getResources().getDisplayMetrics());
	}

	public static int sp2px(Context context, float spVal) {
		return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, spVal, context.getResources().getDisplayMetrics());
	}

	public static float fnPx2dp(Context context, float px) {
		return (px / context.getResources().getDisplayMetrics().density);
	}

	public static float fnPx2sp(Context context, float px) {
		return (px / context.getResources().getDisplayMetrics().scaledDensity);
	}

}