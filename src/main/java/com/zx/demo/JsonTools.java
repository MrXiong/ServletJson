package com.zx.demo;



import com.alibaba.fastjson.JSON;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonTools {
	private final static String TAG = JsonTools.class.getSimpleName();
	
	public static String toJson(Object obj) {
		try {
			return JSON.toJSONString(obj);
		} catch (Exception e) {
		}
		return null;
	}
	
	public static <T> T toObject(String jsonString, Class<T> cls) {
		T t = null;
		try {
			t = JSON.parseObject(jsonString, cls);
		} catch (Exception e) {
		}
		return t;
	}


	public static <T> T toObject(JSONObject jsonObj, Class<T> cls) {
		return toObject(jsonObj.toString(), cls);
	}

	public static <T> List<T> toObjectList(JSONObject jsonObj, Class<T> cls) {
		return toObjectList(jsonObj.toString(), cls);
	}
	
	public static <T> List<T> toObjectList(String jsonString, Class<T> cls) {
		List<T> list = null;
		try {
			list = JSON.parseArray(jsonString, cls);
		} catch (Exception e) {
		}
		if (null == list) {
			list = new ArrayList<T>();
		}
		return list;
	}
}


