package com.fisher.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * `Created` by Fisher at 23:06 on 2017-02-20.
 */
public class MobileUtil {

	public static void fnLongToast(Context context, String msg) {
		Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
	}

	public static void fnToast(Context context, String msg) {
		Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
	}
}
