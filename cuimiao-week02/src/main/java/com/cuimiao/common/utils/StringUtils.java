package com.cuimiao.common.utils;

public class StringUtils {
	
	//判断源字符串是否有值，空引号(空白字符串)也算没值
	public boolean hasLength(String src){
		if(!src.equals("") && src!=null){
			return true;
		}
		return false;
	}
	//判断源字符串是否有值，空引号(空白字符串)和空格也算没值 
	public boolean hasText(String src){
	    //实现代码
		if(!src.equals(" ") && src!=null){
			return true;
		}
		return false;
	}
	//判断是否为手机号码 
	public boolean isMobile1(String src){
		//实现代码
		String regex="^1([38]\\d|5[0-35-9]|7[3678])\\d{8}$";
		return src.matches(regex);
	}
	
	//判断是否为手机号码 (5分)
	public boolean isMobile(String src){
		//实现代码
		String regex = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$";
		return src.matches(regex);
	}
	//反转字符串，例如参数值是“abcdefg”，则输出“gfedcba”
	public String reverse(String src){
//		实现代码
		return new StringBuffer(src).reverse().toString();
	}
	
}
