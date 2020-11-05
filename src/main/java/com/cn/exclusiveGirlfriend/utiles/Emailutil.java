package com.cn.exclusiveGirlfriend.utiles;

import java.util.Random;

public class Emailutil {
	// 随机验证码
	public static String achieveCode() {  //由于数字1 和0 和字母 O,l 有时分不清，所有，没有字母1 、0
		String[] beforeShuffle= new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F",
				"G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a",
				"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
				"w", "x", "y", "z" };
		StringBuffer sb = new StringBuffer();
		Random rand=new Random();
		for (int i = 0; i < 4; i++) {
			sb.append(beforeShuffle[rand.nextInt(beforeShuffle.length)]); //随机获取4位
		}
		return sb.toString();
	}
}
