package com.fisher.utils;

import android.support.annotation.Nullable;
import android.text.TextUtils;

import com.fisher.utils.constants.FileConstant;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * `Created` by Fisher at 23:06 on 2017-02-20.
 */
public class URLUtil {

	/**
	 * Using specific charset encode url.
	 *
	 * @param params  Data to be encoded.
	 * @param charset Charset to be used.
	 * @return Encoded string.
	 */
	public static
	@Nullable
	String getPostDataString(HashMap<String, String> params, String charset) {
		if (null == params) {return null;}
		try {
			StringBuilder result = new StringBuilder();
			for (Map.Entry<String, String> entry : params.entrySet()) {
				result.append("&");
				result.append(URLEncoder.encode(entry.getKey(), charset));
				result.append("=");
				result.append(URLEncoder.encode(entry.getValue(), charset));
			}
			return result.toString().substring(1);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Using utf8 encode url.
	 *
	 * @param params Data to be encoded.
	 * @return Encoded string.
	 */
	public static String getPostDataString(HashMap<String, String> params) {
		return getPostDataString(params, FileConstant.CHARSET_UTF_8);
	}

	/**
	 * Get json object from url encoded string.
	 *
	 * @param urlEncodedString Url encoded string.
	 * @return JSON object.
	 */
	public static JSONObject getJSONFromURLEncoded(String urlEncodedString) {
		String path = urlEncodedString.substring(urlEncodedString.indexOf('?') + 1);
		String[] params = path.split("&");
		JSONObject json = new JSONObject();
		for (String param : params) {
			if (TextUtils.isEmpty(param) || !param.contains("=")) {continue;}
			String[] arr2 = param.split("=");
			try {
				json.put(arr2[0], arr2[1]);
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
		return json;
	}
}
