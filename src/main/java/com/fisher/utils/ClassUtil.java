package com.fisher.utils;

import java.lang.reflect.Field;

/**
 * `Created` by Fisher at 23:06 on 2017-02-20.
 */
public class ClassUtil {

	public static void getFields(Class aClass) {
		Field[] fields = aClass.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			ConsoleUtil.log(fields[i] + ": " + fields[i].getType() + " -> " + fields[i].getName());
			try {
				ConsoleUtil.log(fields[i].getName() + "->" + fields[i].get(null));
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
	}


}
