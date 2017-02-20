package com.fisher.utils.app;

import android.app.Service;

import com.fisher.utils.ConsoleUtil;
import com.fisher.utils.ToastUtil;

/**
 * `Created` by Fisher at 23:06 on 2017-02-20.
 */
public abstract class BaseService extends Service {

	/**
	 * Show a toast.
	 *
	 * @param msg Message to be toasted.
	 */
	protected void toast(String msg) {
		ToastUtil.toast(this, msg);
	}

	/**
	 * Log some object.
	 *
	 * @param obj Object
	 */
	protected void log(Object obj) {
		ConsoleUtil.log(obj);
	}

	/**
	 * Log some string.
	 *
	 * @param text String.
	 */
	protected void log(String text) {
		ConsoleUtil.log(text);
	}

}
