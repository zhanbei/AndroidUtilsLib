package com.fisher.utils;

import android.util.Log;

/**
 * `Created` by Fisher at 23:06 on 2017-02-20.
 *
 * Console util.
 */
public class ConsoleUtil {

	/**
	 * Log string to log.
	 *
	 * @param text String.
	 */
	public static void log(String text) {
		if (AppUtil.isDebug()) {Log.i("ConsoleUtil -->> ", text + "");}
	}

	/**
	 * Log object to log.
	 *
	 * @param obj Object.
	 */
	public static void log(Object obj) {
		log(String.valueOf(obj));
	}

	// when something important happened, then log it

	/**
	 * Log some warning info to log.
	 *
	 * @param msg Message.
	 */
	public static void warning(String msg) {
		if (AppUtil.isDebug()) {Log.w("Warning ->> ", msg);}
	}

	/**
	 * Log some error to log.
	 *
	 * @param bug Some error info.
	 */
	public static void error(String bug) {
		if (AppUtil.isDebug()) {Log.e("Fatal Error ->> ", bug);}
	}
}