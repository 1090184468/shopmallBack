package com.bobo.util;

import net.sf.json.JSONArray;

public class JSONUtil {
	public static String returnJson(Object json) {
		String str="{msg:'请求成功',request:";
		return str+json+"}";
	}
}
