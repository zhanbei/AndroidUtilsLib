package com.fisher.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * `Created` by Fisher at 23:06 on 2017-02-20.
 */
public class ToastUtil {

	public static void toast(String msg) {
		toast(AppUtil.getContext(), msg);
	}

	public static void toast(int stringRes) {
		toast(AppUtil.getString(stringRes));
	}

	public static void toast(Context context, String msg) {
		ConsoleUtil.log(msg);
		Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
	}

	public static void toastLong(Context context, String msg) {
		ConsoleUtil.log(msg);
		Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
	}

}
