package com.cuimiao.common.utils;

import java.util.List;
import java.util.Map;

public class CollectionUtil {
	
	//判断List或Set集合是否有元素，对象为空或对象中没有元素都算没值 
	public boolean ListnotEmpty(List<String> list){
		//实现代码
		return list.isEmpty();
	}
	
	//判断Map集合是否有元素，对象为空或对象中没有元素都算没值 
	public boolean MapnotEmpty(Map<String, String> map){
		//实现代码
		return map.isEmpty();
	}
}
